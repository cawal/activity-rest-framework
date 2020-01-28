import { Component, OnInit } from '@angular/core';
import { Activity, FunctionalEntity } from 'src/model/activity-description';
import { Deployment } from 'src/model/deployment-description';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Activity-REST Bootstrap';
  activity: Activity;
  functionalEntity: FunctionalEntity;
  deployment: Deployment;

  ngOnInit() {
    console.log("executou");
    this.activity = new Activity();
    this.activity.name = "activity";
    console.log(this.activity);
  }
}
