import { FunctionalEntity, Parameter, Dataset, InputDataset, OutputDataset } from './activity-description';
/*
* A command line tool that can be called to execute the activity.
*/
export class CommandLineTool extends FunctionalEntity {
  commandLineTemplate: CommandLineEntryList[];
  standardInputStream: InputDataset | null;
  standardOutputStream: OutputDataset | null;
  standardErrorStream: OutputDataset | null;
  exitCodes: ExitCode[];
  /*       invariant stdInMustBeInputDatasetInRelatedActivity:
             if not self.standardInputStream.oclIsUndefined() then
                 self.activity.inputDatasets->includes(self.standardInputStream)
             else true endif;
         invariant stdOutMustBeOutputDatasetInRelatedActivity:
             if not self.standardOutputStream.oclIsUndefined() then
                 self.activity.outputDatasets->includes(self.standardOutputStream)
             else true endif;
         invariant stdErrMustBeOutputDatasetInRelatedActivity:
             if not self.standardErrorStream.oclIsUndefined() then
                 self.activity.outputDatasets->includes(self.standardErrorStream)
             else true endif;
         invariant stdInMustHave1AsCardinality:
             if not self.standardInputStream.oclIsUndefined() then
                 self.standardInputStream.minimumCardinality = 1
                 and self.standardInputStream.maximumCardinality = 1
             else
                 true
             endif;
         invariant stdOutMustHave1AsCardinality:
             if not self.standardOutputStream.oclIsUndefined() then
                 self.standardOutputStream.minimumCardinality = 1
                 and self.standardOutputStream.maximumCardinality = 1
             else
                 true
             endif;
         invariant stdErrMustHave1AsCardinality:
             if not self.standardErrorStream.oclIsUndefined() then
                 self.standardErrorStream.minimumCardinality = 1
                 and self.standardErrorStream.maximumCardinality = 1
             else
                 true
             endif;*/
}
class ExitCode {
  code: number;
  reportMessage: string | null;
  status: TerminationStatus;
}
enum TerminationStatus {
  SUCCEEDED = 0,
  FAILED = 1,
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
  manipulators: StringListManipulator[];
}
class ToolNameCommandLineEntry extends CommandLineEntryList { }
class LiteralCommandLineEntryList extends CommandLineEntryList {
  literals: string[];
  /*invariant OneOrMoreLiterals:
  literals -> size() > 0;*/
}
class DatasetCommandLineEntryList extends CommandLineEntryList {
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

