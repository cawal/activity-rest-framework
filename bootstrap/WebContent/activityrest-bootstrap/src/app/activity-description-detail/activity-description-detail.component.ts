import { Component, OnInit, Input } from "@angular/core";
import {
  Parameter,
  InputDataset,
  OutputDataset,
  ParameterType,
} from "src/model/activity-description";

@Component({
  selector: "app-activity-description-detail",
  templateUrl: "./activity-description-detail.component.html",
  styleUrls: ["./activity-description-detail.component.css"],
})
export class ActivityDescriptionDetailComponent implements OnInit {
  @Input() detailedComponent: any;
  keys = Object.keys;
  parameterTypes = ParameterType;

  constructor() {}

  ngOnInit() {}

  isParameter(t: any): t is Parameter {
    return t instanceof Parameter;
  }

  isInputDataset(t: any): t is InputDataset {
    return t instanceof InputDataset;
  }

  isOutputDataset(t: any): t is OutputDataset {
    return t instanceof OutputDataset;
  }
}
