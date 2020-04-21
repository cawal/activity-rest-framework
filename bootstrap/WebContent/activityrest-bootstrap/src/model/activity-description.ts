interface IdentifiableElement {
  name: string;
  remark: string | null;
}

/*
 * This metaclass describes the information necessary to execute a command
 * line application, as well as its inputs and outputs.
 */
export class Activity implements IdentifiableElement {
  name: string;
  remark: string;
  parameters: Parameter[] = [];
  inputDatasets: InputDataset[] = [];
  outputDatasets: OutputDataset[] = [];
  //functionalEntity: FunctionalEntity | null;
}

interface MultiplicityElement {
  minimumCardinality: number;
  maximumCardinality: number;
  /*  invariant OnlyPositiveNumbersForMinimumCardinality:
      minimumCardinality >= 1;
  invariant OnlyPositiveNumbersOrMinusOneForMaximumCardinality:
  maximumCardinality >= 1 or maximumCardinality = -1;*/
}

/*
 * This metaclass describes a parameter of a command line application.
 * A parameter is a argument that is passed by its value.
 * @SeeOther Dataset
 */
export class Parameter implements MultiplicityElement, IdentifiableElement {
  minimumCardinality: number;
  maximumCardinality: number;
  name: string;
  remark: string | null;
  parameterType: ParameterType;
  defaultValue: string[];
  constraints: Constraint[];
  getExampleValues(): string[] {
    let values = [];
    if (this.maximumCardinality != 1) {
      values = [
        this.name.toUpperCase() + "_0",
        "...",
        this.name.toUpperCase() + "_N",
      ];
    } else {
      values = [this.name.toUpperCase()];
    }

    return values;
  }
  /*invariant defaultValueCardinalityMustBeLessThanMaximun:
  if maximumCardinality > 1 then
  defaultValue -> size() <= maximumCardinality
              else true endif;*/
}
export enum ParameterType {
  STRING = "STRING",
  INTEGER = "INTEGER",
  REAL = "REAL",
  BOOLEAN = "BOOLEAN",
}

/*
 * This metaclass describes a dataset of the command line application.
 * A Dataset is a number of related files. These files contains the data
 * of most interest for the analysis and are passed for the underlying tool
 * by their file system paths.
 */
export interface Dataset extends MultiplicityElement, IdentifiableElement {
  mimetype: string | null;
  constraints: Constraint[];
  getExampleValues(): string[];
}
export class InputDataset implements Dataset {
  mimetype: string;
  constraints: Constraint[];
  minimumCardinality: number;
  maximumCardinality: number;
  name: string;
  remark: string;
  getExampleValues(): string[] {
    let values = [];
    if (this.maximumCardinality != 1) {
      values = [
        this.name.toUpperCase() + "_0",
        "...",
        this.name.toUpperCase() + "_N",
      ];
    } else {
      values = [this.name.toUpperCase()];
    }

    return values;
  }
}
export class OutputDataset implements Dataset {
  mimetype: string;
  constraints: Constraint[];
  minimumCardinality: number;
  maximumCardinality: number;
  name: string;
  remark: string;
  getExampleValues(): string[] {
    let values = [];
    if (this.maximumCardinality != 1) {
      values = [
        this.name.toUpperCase() + "_0",
        "...",
        this.name.toUpperCase() + "_N",
      ];
    } else {
      values = [this.name.toUpperCase()];
    }

    return values;
  }
}
export class Constraint {
  name: string;
}

/*
 * Abstract class to describe a functional entity that can executes
 * an analysis activity.
 */
export abstract class FunctionalEntity implements IdentifiableElement {
  name: string;
  remark: string;
  activity: Activity | null;
}
