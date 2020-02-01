import { Component, OnInit, Input } from '@angular/core';
import { Deployment } from 'src/model/deployment-description';

@Component({
  selector: 'app-deployment-model',
  templateUrl: './deployment-model.component.html',
  styleUrls: ['./deployment-model.component.css']
})
export class DeploymentModelComponent implements OnInit {

  @Input() deploymentModel: Deployment;

  constructor() { }

  ngOnInit() {
  }

}
