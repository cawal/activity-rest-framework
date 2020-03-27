import { Injectable, Input } from "@angular/core";
import { Activity, FunctionalEntity } from "src/model/activity-description";
import { Deployment } from "src/model/deployment-description";

@Injectable({
  providedIn: "root"
})
export class ProjectGeneratorService {
  constructor() {}

  generateClient(
    activity: Activity,
    functionalEntity: FunctionalEntity,
    deployment: Deployment
  ) {
    console.log("Generating client: ");
    console.log(activity);
    console.log(functionalEntity);
    console.log(deployment);
  }

  generateService(
    activity: Activity,
    functionalEntity: FunctionalEntity,
    deployment: Deployment
  ) {
    console.log("Generating client: ");
    console.log(activity);
    console.log(functionalEntity);
    console.log(deployment);
  }
}
