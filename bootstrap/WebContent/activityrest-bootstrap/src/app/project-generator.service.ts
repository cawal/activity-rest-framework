import { Injectable, Input } from "@angular/core";
import { Activity, FunctionalEntity } from "src/model/activity-description";
import { Deployment } from "src/model/deployment-description";
import { HttpClient } from "@angular/common/http";

@Injectable() //{
//  providedIn: "root"
//}
export class ProjectGeneratorService {
  constructor(private http: HttpClient) {}

  host = "http://localhost:8080";
  generateGalaxyClientPath = "/bootstrap-server/generate-galaxy-client";
  generateServicePath = "/boostrap-server/generate-service";

  generateClient(
    activity: Activity,
    functionalEntity: FunctionalEntity,
    deployment: Deployment
  ) {
    console.log("Generating client: ");
    console.log(activity);
    console.log(functionalEntity);
    console.log(deployment);

    let url = `${this.host}${this.generateGalaxyClientPath}`;

    this.http
      .post(url, {
        activity: activity,
        deployment: deployment
      })
      .subscribe((data: any) => this.downloadFile(data)),
      error => console.log(`Error downloading the file. ${error}`),
      () => console.info("OK");
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

    let url = `${this.host}${this.generateServicePath}`;

    this.http
      .post(url, {
        activity: activity,
        functionalEntity: functionalEntity,
        deployment: deployment
      })
      .subscribe((data: any) => this.downloadFile(data)),
      error => console.log(`Error downloading the file. ${error}`),
      () => console.info("OK");
  }

  downloadFile(data: any) {
    console.log(data);
    const blob = new Blob([data], { type: "application/octet-stream" });
    //const blob = data.blob();
    const url = window.URL.createObjectURL(blob);
    window.open(url);
  }
}
