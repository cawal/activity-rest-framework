import { FunctionalEntity, Parameter, Dataset, InputDataset, OutputDataset } from './activity-description';
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
  SUCCEEDED = 'SUCCEEDED',
  FAILED = 'FAILED',
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
}
class ToolNameCommandLineEntry extends CommandLineEntryList { }
export class LiteralCommandLineEntryList extends CommandLineEntryList {
  literals: string[] = [];
  /*invariant OneOrMoreLiterals:
  literals -> size() > 0;*/
}
export class DatasetCommandLineEntryList extends CommandLineEntryList {
  dataset: Dataset;
}
export class ParameterCommandLineEntryList extends CommandLineEntryList {
  parameter: Parameter;
}
















/*
   * Subclasses must implement a closure on lists of strings.
   */
export abstract class StringListManipulator {
  // abstract transform(stringList: string[]): string[];
}
export class Join extends StringListManipulator {
  delimiter: string;
  readonly identifier: "Join";
}
export class PrependEach extends StringListManipulator {
  value: string;
  readonly identifier: "PrependEach";
}
export class AppendEach extends StringListManipulator {
  value: string;
  readonly identifier: "AppendEach";
}
export class AppendListWith extends StringListManipulator {
  value: string;
  readonly identifier: "AppendListWith";
}
export class PrependListWith extends StringListManipulator {
  value: string;
  readonly identifier: "PrependListWith";
}
export class ToFlag extends StringListManipulator {
  ifTrue: string | null;
  ifFalse: string | null;
  readonly identifier: "ToFlag";
}

export class StringListManipulatorFactory {
  static create(className: string): StringListManipulator {
    switch (className) {
      case "Join": { return new Join(); }
      case "PrependEach": { return new PrependEach(); }
      case "AppendEach": { return new AppendEach(); }
      case "AppendListWith": { return new AppendListWith(); }
      case "PrependListWith": { return new PrependListWith(); }
      case "ToFlag": { return new ToFlag(); }
    }
  }
}
