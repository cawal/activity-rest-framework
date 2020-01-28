import { Component, OnInit, Input } from '@angular/core';
import { Activity } from 'src/model/activity-description';

@Component({
  selector: 'app-activity-description',
  templateUrl: './activity-description.component.html',
  styleUrls: ['./activity-description.component.css']
})
export class ActivityDescriptionComponent implements OnInit {

  @Input() activity: Activity;

  constructor() {
  }

  ngOnInit() {
  }

  log() {
    console.log(this.activity);
  }

}
