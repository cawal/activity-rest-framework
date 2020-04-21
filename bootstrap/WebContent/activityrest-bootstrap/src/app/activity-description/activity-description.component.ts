import { Component, OnInit, Input } from "@angular/core";
import {
  Activity,
  Parameter,
  ParameterType,
  InputDataset,
  OutputDataset,
} from "src/model/activity-description";

import { library, dom } from "@fortawesome/fontawesome-svg-core";
import { fas, faPlus, faTimes } from "@fortawesome/free-solid-svg-icons";

import { ParameterCommandLineEntryList } from "src/model/tool-description";

@Component({
  selector: "app-activity-description",
  templateUrl: "./activity-description.component.html",
  styleUrls: ["./activity-description.component.css"],
})
export class ActivityDescriptionComponent implements OnInit {
  @Input() activity: Activity;
  keys = Object.keys;
  parameterTypes = ParameterType;
  detail: any = null;

  parameterIdSequence = 0;
  inputDatasetIdSequence = 0;
  outputDatasetIdSequence = 0;

  iconAdd = faPlus;
  iconRemove = faTimes;

  constructor() {}

  ngOnInit() {}

  addParameter(): void {
    let parameter = new Parameter();
    parameter.name = "parameter-" + this.parameterIdSequence++;
    this.activity.parameters.push(parameter);
    this.showDetail(parameter);
  }

  removeParameter(parameter: Parameter): void {
    let index = this.activity.parameters.indexOf(parameter);
    this.activity.parameters.splice(index, 1);
  }

  addInputDataset(): void {
    let dataset = new InputDataset();
    dataset.name = "input-dataset-" + this.inputDatasetIdSequence++;
    this.activity.inputDatasets.push(dataset);
    this.showDetail(dataset);
  }

  removeInputDataset(inputDataset: InputDataset): void {
    let index = this.activity.inputDatasets.indexOf(inputDataset);
    this.activity.inputDatasets.splice(index, 1);
  }

  addOutputDataset(): void {
    let dataset = new OutputDataset();
    dataset.name = "output-dataset-" + this.outputDatasetIdSequence++;
    this.activity.outputDatasets.push(dataset);
    this.showDetail(dataset);
  }

  removeOutputDataset(outputDataset: OutputDataset): void {
    let index = this.activity.outputDatasets.indexOf(outputDataset);
    this.activity.outputDatasets.splice(index, 1);
  }

  showDetail(e: any) {
    this.detail = e;
  }
}
