import { Component, OnInit, Input } from '@angular/core';
import { Activity, Parameter, ParameterType, InputDataset, OutputDataset } from 'src/model/activity-description';
import { ParameterCommandLineEntryList } from 'src/model/tool-description';

@Component({
  selector: 'app-activity-description',
  templateUrl: './activity-description.component.html',
  styleUrls: ['./activity-description.component.css']
})
export class ActivityDescriptionComponent implements OnInit {

  @Input() activity: Activity;
  keys = Object.keys;
  parameterTypes = ParameterType;

  constructor() {
  }

  ngOnInit() {

  }


  addParameter(): void {
    this.activity.parameters.push(new Parameter());
  }

  removeParameter(parameter: Parameter): void {
    let index = this.activity.parameters.indexOf(parameter);
    this.activity.parameters.splice(index, 1);
  }

  addInputDataset(): void {
    this.activity.inputDatasets.push(new InputDataset());
  }

  removeInputDataset(inputDataset: InputDataset): void {
    let index = this.activity.inputDatasets.indexOf(inputDataset);
    this.activity.inputDatasets.splice(index, 1);
  }

  addOutputDataset(): void {
    this.activity.outputDatasets.push(new OutputDataset());
  }

  removeoutputDataset(outputDataset: OutputDataset): void {
    let index = this.activity.outputDatasets.indexOf(outputDataset);
    this.activity.outputDatasets.splice(index, 1);
  }



  log() {
    console.log(this.activity);
  }

}
