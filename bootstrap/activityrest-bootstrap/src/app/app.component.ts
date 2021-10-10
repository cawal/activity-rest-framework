import { Component, OnInit } from "@angular/core";
import { Activity, FunctionalEntity } from "src/model/activity-description";
import { Deployment } from "src/model/deployment-description";
import { CommandLineTool } from "src/model/tool-description";
import { ProjectGeneratorService } from "./project-generator.service";
import { HttpClient, HttpBackend } from "@angular/common/http";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent implements OnInit {
  title = "Activity-REST Boot";
  activity: Activity;
  functionalEntity: CommandLineTool;
  deployment: Deployment;
  generatorService: ProjectGeneratorService;
  state: String = "ACTIVITY";

  isFunctionalEntityEnabled = false;
  isDeploymentEnabled = false;
  isGenerationEnabled = false;

  constructor(private http: HttpClient) { }

  ngOnInit() {
    console.log("executou");
    this.activity = new Activity();
    this.activity.name = "MyActivity";

    this.functionalEntity = new CommandLineTool();
    this.functionalEntity.name = "tool";
    this.deployment = new Deployment();
    this.generatorService = new ProjectGeneratorService(this.http);
  }

  showActivity() {
    this.state = "ACTIVITY";
  }

  showFunctionalEntity() {
    this.state = "FUNCTIONAL_ENTITY";
  }

  showDeployment() {
    this.state = "DEPLOYMENT";
  }

  showGenerationScreen() {
    this.state = "GENERATION";
  }

  moveToNextScreen() {
    switch (this.state) {
      case "ACTIVITY":
        this.isFunctionalEntityEnabled = true;
        this.state = "FUNCTIONAL_ENTITY";
        break;
      case "FUNCTIONAL_ENTITY":
        this.isDeploymentEnabled = true;
        this.state = "DEPLOYMENT";
        break;
      case "DEPLOYMENT":
        this.isGenerationEnabled = true;
        this.state = "GENERATION";
        break;
    }
  }

  log() {
    console.log(this.activity);
    console.log(this.functionalEntity);
    console.log(this.deployment);
    console.log(this.state);
  }
}
