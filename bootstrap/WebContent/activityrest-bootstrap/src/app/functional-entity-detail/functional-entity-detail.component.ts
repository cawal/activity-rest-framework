import { Component, OnInit, Input } from "@angular/core";
import { ExitCode, CommandLineEntryList } from "src/model/tool-description";
import { Activity } from "src/model/activity-description";

@Component({
  selector: "app-functional-entity-detail",
  templateUrl: "./functional-entity-detail.component.html",
  styleUrls: ["./functional-entity-detail.component.css"],
})
export class FunctionalEntityDetailComponent implements OnInit {
  @Input() detailedComponent: any;
  @Input() activity: Activity;

  constructor() {}

  ngOnInit() {}

  isExitCode(e: any): e is ExitCode {
    return e instanceof ExitCode;
  }

  isCommandLineEntryList(e: any): e is CommandLineEntryList {
    return e instanceof CommandLineEntryList;
  }
}
