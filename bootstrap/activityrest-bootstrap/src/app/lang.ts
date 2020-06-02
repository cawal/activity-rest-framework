export class Lang {
  private constructor() {
    this.slm = new StringListManipulatorsLang();
    this.paramsTypes = new ParameterTypeLang();
    this.deploy = new DeploymentLang();
  }

  private static instance: Lang;

  static getInstance(): Lang {
    if (!Lang.instance) {
      Lang.instance = new Lang();
    }

    return Lang.instance;
  }

  activity =
    "An activity consists of a process executed on a number of (input) datasets in order to obtain a number of (output) datasets as result. This process can also be guided by execution parameters.";

  activityName =
    "An identifier to the activity. Only letters, digits, hyfens and underscores are allowed.";

  parameter =
    "An execution parameter consists of a user-provided value that guides the execution of the analysis activity. Such value is passed to the underlying tool as a command-line argument.";

  parameterName =
    "A named identifier to the parameter. Only letters, digits, hyfens and underscores are allowed.";

  inputDataset =
    "An input dataset consists of a set of user-provided files that are processed as the main source of data for the analysis activity. This dataset is passed to the underlying tool by its path or by the process' standard input stream.";

  datasetName =
    "A named identifier to the dataset. Only letters, digits, hyfens and underscores are allowed.";

  outputDataset =
    "An output dataset consists of a set of files produced as the results of the analysis activity. The output dataset location is passed to the underlying tool by its path.";

  remarks = "A description of the element, form-free.";

  parameterType = "The primitive type of a parameter value";

  parameterMinimumCardinality =
    "The minimun number of values the user may submit to a parameter. No parameter may receive less than 1 value.";

  parameterMaximumCardinality =
    "The maximum number of values the user may submit to a parameter. -1 represents unbounded cardinality.";

  parameterRemove = "Remove parameter";

  parameterEdit = "Edit parameter";

  parameterAdd = "Add parameter";

  datasetMinimumCardinality =
    "The minimun number of files the user may submit to an input dataset or the minimum number of files produced in a output dataset. No dataset may have minimum cardinality less than 1.";

  datasetMaximumCardinality =
    "The maximum number of files the user may submit to an input dataset dataset or the maximum number of files produced in an output dataset. -1 represents unbounded cardinality.";

  datasetMimeType = "The MIME type of the dataset files";

  datasetRemove = "Remove dataset";

  datasetAdd = "Add dataset";

  datasetEdit = "Edit dataset";

  commandLineTool =
    "The analysis tool that will be wrapped by the service to perform the analysis activity.";

  toolName =
    "The tool executable/identifier. Only letters, digits, hyfens and underscores are allowed.";

  commandLineTemplate =
    "Command line template defines an ordered list of arguments that will be passed to the underlying tool. These arguments are constructed on-the-fly using the parameter values and input/output datasets that where submitted by the user. An example of how these arguments may be constructed is provided below.";

  commandLineTemplateEdit = "Edit entry list template.";

  commandLineTemplateRemove = "Remove entry list template.";

  commandLineTemplateMoveUp = "Move the entry list to previous position.";

  commandLineTemplateMoveDown = "Move the entry list to next position.";

  commandLineTemplateAddLiterals =
    "Add entries composed of pre-defined strings.";

  commandLineTemplateAddParameter = "Add entry based on a parameter's value.";

  commandLineTemplateAddDataset = "Add entry based on a dataset's value.";

  exitCodes =
    "The exit code the underlying tool returns after its execution. Usually a 0 exit code represents success. Other exit codes may be described in the tool manual.";

  exitCodeEdit = "Edit exit code";

  exitCodeAdd = "Add exit code";

  exitCodeRemove = "Remove exit code";

  exitCodeCode = "The integer returned after the process ends.";

  exitCodeStatus = "If the code represents either success or failure.";

  exitCodeDescription =
    "A small description of the exit code meaning, usually found in the documentation of the underlying command-line tool.";

  streamRedirections =
    "Stream redirections allow to redirect the standard streams of the executing processes from/to the input/output datasets.";

  literalAdd = "Add a string to the list of literals.";
  literalRemove = "Remove item from a list of literals.";

  slm: StringListManipulatorsLang;
  paramsTypes: ParameterTypeLang;
  deploy: DeploymentLang;
}

class ParameterTypeLang {
  constructor() {}

  STRING =
    "STRING defines parameters represented as sequence of characters. White spaces are permitted.";

  REAL =
    "REAL defines parameters represented as real numbers, with dots separating the integer part and the decimal part.";

  INTEGER =
    "INTEGER defines parameters represented as sequence of interger numbers.";

  BOOLEAN =
    "BOOLEAN defines parameters represented by one of two values: 'true' or 'false'.";
}

class StringListManipulatorsLang {
  constructor() {}

  Join =
    "Join unites all the entry values into a single string. A delimiter may be provided to separate these values.";

  PrependEach =
    "PrependEach adds a given string to the beginning of each value of the list it receives. The number of elements of the list remains constant.";

  AppendEach =
    "AppendEach adds a given string to the end of each value of the list it receives. The number of elements of the list remains constant.";

  PrependListWith =
    "PrependListWith adds a new item to the beginning of the list it receives. The number of items in the new list is the number of items of the previous list plus one.";

  AppendListWith =
    "AppendListWith adds a new item to the end of the list it receives. The number of items in the new list is the number of items of the previous list plus 1.";

  ToFlag =
    "ToFlag substitutes the boolean values received into one of the different strings setted on its attributes 'IfTrue' and 'IfFalse'. The number of items in the list remains constant.";

  remove = "Remove this manipulator";

  up = "Move this manipulator as the previous step of the processing pipeline.";

  down = "Move this manipulator as the next step of the processing pipeline.";

  stringListManipulators =
    "A list of operations to transform the initial list before adding it to the tool's execution arguments.";
}

class DeploymentLang {
  constructor() {}

  serviceName =
    "An identifier for the service. Only letters, digits, hyfens and underscores are allowed.";

  serviceVersion = "The service version.";

  containerName =
    "An identifier for the container. Only letters, digits, hyfens and underscores are allowed.";

  containerUrl = "The base URL of the new service's  root resource.";

  contactName = "The name of the service's maintainer.";

  contactEmail = "The email address of the maintainer";

  contactUrl = "An optional address to maintainer's site";
}
