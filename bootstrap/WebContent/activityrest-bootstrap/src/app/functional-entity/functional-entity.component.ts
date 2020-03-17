import { Component, OnInit, Input } from "@angular/core";
import { FunctionalEntity, Activity } from "src/model/activity-description";
import {
  CommandLineTool,
  ExitCode,
  TerminationStatus,
  ParameterCommandLineEntryList,
  LiteralCommandLineEntryList,
  DatasetCommandLineEntryList
} from "src/model/tool-description";

@Component({
  selector: "app-functional-entity",
  templateUrl: "./functional-entity.component.html",
  styleUrls: ["./functional-entity.component.css"]
})
export class FunctionalEntityComponent implements OnInit {
  @Input() commandLineTool: CommandLineTool;
  @Input() activity: Activity;

  constructor() {}

  ngOnInit() {}

  /** @internal */ isCommandLineTool(
    f: FunctionalEntity
  ): f is CommandLineTool {
    return f instanceof CommandLineTool;
  }

  addExitCode() {
    let newExitCode = new ExitCode();
    newExitCode.code = 0;
    newExitCode.status = TerminationStatus.SUCCEEDED;
    newExitCode.reportMessage = "";
    this.commandLineTool.exitCodes.push(newExitCode);
  }

  removeExitCode(e: ExitCode) {
    let index = this.commandLineTool.exitCodes.indexOf(e);
    this.commandLineTool.exitCodes.splice(index, 1);
  }
}
