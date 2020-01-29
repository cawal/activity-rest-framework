import { Component, OnInit } from '@angular/core';
import { Activity, FunctionalEntity } from 'src/model/activity-description';
import { Deployment } from 'src/model/deployment-description';
import { CommandLineTool } from 'src/model/tool-description';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Activity-REST Bootstrap';
  activity: Activity;
  functionalEntity: CommandLineTool;
  deployment: Deployment;

  ngOnInit() {
    console.log("executou");
    this.activity = new Activity();
    this.activity.name = "MyActivity";

    this.functionalEntity = new CommandLineTool();
    this.functionalEntity.name = "tool";
    this.deployment = new Deployment();
    console.log(this.activity);
  }


  log() {
    console.log(this.activity);
    console.log(this.functionalEntity);
    console.log(this.deployment);
  }
}
