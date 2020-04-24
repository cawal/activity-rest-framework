export class Lang {
  private constructor() {}

  private static instance: Lang;

  static getInstance(): Lang {
    if (!Lang.instance) {
      Lang.instance = new Lang();
    }

    return Lang.instance;
  }

  activity =
    "An activity consists of a process executed on a number of (input) datasets in order to obtain a number of (output) datasets as result. This process can also be guided by execution parameters.";

  parameter =
    "An execution parameter consists of user-provided values that guides the execution of the analysis activity. These values are passed to the underlying tool as its arguments.";

  inputDataset =
    "An input dataset consists of a set of user-provided files that are processed as the main source of data for the analysis activity. These files are passed to the underlying tool by their paths or by the process' standard input stream.";

  outputDataset =
    "An output dataset consists of a set of files produced as the results f the analysis activity. The final location of these files are passed to the underlying tool by their paths. ";

  parameterMinimumCardinality =
    "The minimun number of values the user may submit to a parameter. No parameter may receive less than 1 value.";

  datasetMinimumCardinality =
    "The minimun number of files the user may submit to an input dataset or that are produced in a output dataset. No dataset may have minimum cardinality less than 1.";

  parameterMaximumCardinality =
    "The maximum number of values the user may submit to a parameter. -1 represents unbounded cardinality.";

  datasetMaximumCardinality =
    "The maximum number of files the user may submit to an input dataset dataset or that are produced in an output dataset. -1 represents unbounded cardinality.";

  commandLineTool =
    "The analysis tool that is wrapped by the service and is used to perform the analysis activity.";

  commandLineTemplate =
    "Command line template defines an ordered list of arguments that will be passed to the underlying tool. These arguments are constructed on-the-fly using the parameter values and input/output datasets that where submitted by the user. An example of these arguments may be constructed are provided below.";

  exitCodes =
    "The exit codes the underlying tool returns after its execution. Usually a 0 exit code represents success. Other exit codes may be described in the tool manual.";

  streamRedirections =
    "Stream redirections allow to redirect the standard streams of the executing processes from/to the input/output datasets.";
}
