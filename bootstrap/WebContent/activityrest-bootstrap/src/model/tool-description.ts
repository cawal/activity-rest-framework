import {
  FunctionalEntity,
  Parameter,
  Dataset,
  InputDataset,
  OutputDataset,
} from "./activity-description";
/*
 * A command line tool that can be called to execute the activity.
 */
export class CommandLineTool extends FunctionalEntity {
  commandLineTemplate: CommandLineEntryList[] = [];
  standardInputStream: InputDataset | null;
  standardOutputStream: OutputDataset | null;
  standardErrorStream: OutputDataset | null;
  exitCodes: ExitCode[] = [];
}
export class ExitCode {
  code: number;
  reportMessage: string | null;
  status: TerminationStatus;
}
export enum TerminationStatus {
  SUCCEEDED = "SUCCEEDED",
  FAILED = "FAILED",
}

/*
 * A list of entries for the command line tool.
 * This entry list can be manipulated before being used
 * for the command line.
 * Each item of the final list will be used as a different
 * argument for the command line tool.
 *
 */
export abstract class CommandLineEntryList {
  manipulators: StringListManipulator[] = [];

  getCommandLineEntries(base: string[]) {
    let aux: string[] = base;
    for (let m of this.manipulators) {
      aux = m.transform(aux);
    }
    return aux;
  }
}
class ToolNameCommandLineEntry extends CommandLineEntryList {}
export class LiteralCommandLineEntryList extends CommandLineEntryList {
  literals: string[] = [];
  /*invariant OneOrMoreLiterals:
  literals -> size() > 0;*/
}
export class DatasetCommandLineEntryList extends CommandLineEntryList {
  dataset: string;
}
export class ParameterCommandLineEntryList extends CommandLineEntryList {
  parameter: string;
}

/*
 * Subclasses must implement a closure on lists of strings.
 */
export abstract class StringListManipulator {
  abstract transform(stringList: string[]): string[];
  flatten(listOfStringList): string[] {
    var flattened = [];
    for (var i = 0; i < listOfStringList.length; i++) {
      if (Array.isArray(listOfStringList[i])) {
        flattened = flattened.concat(this.flatten(listOfStringList[i]));
      } else {
        flattened.push(listOfStringList[i]);
      }
    }
    return flattened;
  }
}
export class Join extends StringListManipulator {
  delimiter: string;
  identifier = "Join";
  transform(stringList: string[]): string[] {
    return [stringList.join(this.delimiter)];
  }
}
export class PrependEach extends StringListManipulator {
  value: string;
  identifier = "PrependEach";
  transform(stringList: string[]): string[] {
    return this.flatten(stringList.map((e) => this.value + e));
  }
}
export class AppendEach extends StringListManipulator {
  value: string;
  identifier = "AppendEach";

  transform(stringList: string[]): string[] {
    return this.flatten(stringList.map((e) => e + this.value));
  }
}
export class AppendListWith extends StringListManipulator {
  value: string;
  identifier = "AppendListWith";

  transform(stringList: string[]): string[] {
    let clone = Object.assign([], stringList);
    return clone.concat(this.value);
  }
}
export class PrependListWith extends StringListManipulator {
  value: string;
  identifier = "PrependListWith";
  transform(stringList: string[]): string[] {
    let clone = Object.assign([], stringList);
    return [this.value].concat(clone);
  }
}
export class ToFlag extends StringListManipulator {
  ifTrue: string | null;
  ifFalse: string | null;
  identifier = "ToFlag";
  transform(stringList: string[]): string[] {
    return stringList.map((e) => {
      if (e) {
        return this.ifTrue;
      } else {
        return this.ifFalse;
      }
    });
  }
}

export class StringListManipulatorFactory {
  static create(className: string): StringListManipulator {
    switch (className) {
      case "Join": {
        return new Join();
      }
      case "PrependEach": {
        return new PrependEach();
      }
      case "AppendEach": {
        return new AppendEach();
      }
      case "AppendListWith": {
        return new AppendListWith();
      }
      case "PrependListWith": {
        return new PrependListWith();
      }
      case "ToFlag": {
        return new ToFlag();
      }
    }
  }
}
