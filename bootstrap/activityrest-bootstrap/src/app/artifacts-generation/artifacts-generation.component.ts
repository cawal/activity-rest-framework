import { Component, OnInit, Input } from "@angular/core";
import { ProjectGeneratorService } from "../project-generator.service";
import { Activity, FunctionalEntity } from "src/model/activity-description";
import { Deployment } from "src/model/deployment-description";

@Component({
  selector: "app-artifacts-generation",
  templateUrl: "./artifacts-generation.component.html",
  styleUrls: ["./artifacts-generation.component.css"]
})
export class ArtifactsGenerationComponent implements OnInit {
  @Input() generatorService: ProjectGeneratorService;
  @Input() activity: Activity;
  @Input() functionalEntity: FunctionalEntity;
  @Input() deployment: Deployment;

  constructor() {}

  ngOnInit() {}
}
