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
    "An identifier to the activity. Only letters, digits, hyfens and  underscores are allowed.";

  parameter =
    "An execution parameter consists of user-provided values that guides the execution of the analysis activity. These values are passed to the underlying tool as its arguments.";

  parameterName =
    "An identifier to the parameter. Only letters, digits, hyfens and  underscores are allowed.";

  inputDataset =
    "An input dataset consists of a set of user-provided files that are processed as the main source of data for the analysis activity. These files are passed to the underlying tool by their paths or by the process' standard input stream.";

  datasetName =
    "An identifier to the dataset. Only letters, digits, hyfens and  underscores are allowed.";

  outputDataset =
    "An output dataset consists of a set of files produced as the results f the analysis activity. The final location of these files are passed to the underlying tool by their paths. ";

  remarks = "A description of the element, form-free.";

  parameterType = "The primitive type of the parameter values";

  parameterMinimumCardinality =
    "The minimun number of values the user may submit to a parameter. No parameter may receive less than 1 value.";

  parameterMaximumCardinality =
    "The maximum number of values the user may submit to a parameter. -1 represents unbounded cardinality.";

  parameterRemove = "Remove parameter";

  parameterEdit = "Edit parameter";

  parameterAdd = "Add parameter";

  datasetMinimumCardinality =
    "The minimun number of files the user may submit to an input dataset or that are produced in a output dataset. No dataset may have minimum cardinality less than 1.";

  datasetMaximumCardinality =
    "The maximum number of files the user may submit to an input dataset dataset or that are produced in an output dataset. -1 represents unbounded cardinality.";

  datasetMimeType = "The MIME type of the dataset files";

  datasetRemove = "Remove dataset";

  datasetAdd = "Add dataset";

  datasetEdit = "Edit dataset";

  commandLineTool =
    "The analysis tool that is wrapped by the service and is used to perform the analysis activity.";

  toolName =
    "The tool executable/identifier. Only letters, digits, hyfens and  underscores are allowed.";

  commandLineTemplate =
    "Command line template defines an ordered list of arguments that will be passed to the underlying tool. These arguments are constructed on-the-fly using the parameter values and input/output datasets that where submitted by the user. An example of these arguments may be constructed are provided below.";

  commandLineTemplateEdit = "Edit entry list template.";

  commandLineTemplateRemove = "Remove entry list template.";

  commandLineTemplateMoveUp = "Move the entry list to previous position.";

  commandLineTemplateMoveDown = "Move the entry list to next position.";

  commandLineTemplateAddLiterals =
    "Add entries composed of pre-defined strings.";

  commandLineTemplateAddParameter =
    "Add entries based on a parameter's values.";

  commandLineTemplateAddDataset = "Add entries based on a dataset's values.";

  exitCodes =
    "The exit codes the underlying tool returns after its execution. Usually a 0 exit code represents success. Other exit codes may be described in the tool manual.";

  exitCodeEdit = "Edit exit code";

  exitCodeAdd = "Add exit code";

  exitCodeRemove = "Remove exit code";

  exitCodeCode = "The integer returned after the process ends.";

  exitCodeStatus = "If the code represents either success or failure.";

  exitCodeDescription =
    "A small description of the exit code meaning, usually found in tool documentation.";

  streamRedirections =
    "Stream redirections allow to redirect the standard streams of the executing processes from/to the input/output datasets.";

  literalAdd = "Add a string to the literals list";
  literalRemove = "Remove item from literals list.";

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
    "Join unites all the values in a single string. A delimiter may be provided to separate the entries.";

  PrependEach =
    "PrependEach adds a given string to the beginning  of each value of the list it receives. The number of elements of the list remains constant.";

  AppendEach =
    "AppendEach adds a given string to the end  of each value of the list it receives. The number of elements of the list remains constant.";

  PrependListWith =
    "PrependListWith adds a new item to the beginning of the list it receives. The number of items in the new list is the number of items of the previous list + 1.";

  AppendListWith =
    "AppendListWith adds a new item to the end of the list it receives. The number of items in the new list is the number of items of the previous list + 1.";

  ToFlag =
    "ToFlag substitutes the boolean values provided for a parameter into two different values: one if the value is true and other if the value is false. The number of items in the list remains constant.";

  remove = "Remove this manipulator";

  up = "Execute this manipulator early.";

  down = "Execute this manipulator later.";

  stringListManipulators =
    "A list of operations to transform the initial list before adding  it to the tool's execution arguments.";
}

class DeploymentLang {
  constructor() {}

  serviceName =
    "An identifier for the service. Only letters, digits, hyfens and  underscores are allowed.";

  serviceVersion = "The service version.";

  containerName =
    "An identifier for the container. Only letters, digits, hyfens and  underscores are allowed.";

  containerUrl = "The base URL of the new service's  root resource.";

  contactName = "The name of the service's maintainer.";

  contactEmail = "The email address of the maintainer";

  contactUrl = "An optional address to maintainer's site";
}
