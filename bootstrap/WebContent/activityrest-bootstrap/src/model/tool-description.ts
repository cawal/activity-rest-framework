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
abstract class CommandLineEntryList {
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
abstract class StringListManipulator {
  // abstract transform(stringList: string[]): string[];
}
export class Join extends StringListManipulator {
  delimiter: string;
}
export class PrependEach extends StringListManipulator {
  value: string;
}
export class AppendEach extends StringListManipulator {
  value: string;
}
export class AppendListWith extends StringListManipulator {
  value: string;
}
export class PrependListWith extends StringListManipulator {
  value: string;
}
export class ToFlag extends StringListManipulator {
  ifTrue: string | null;
  ifFalse: string | null;
}

