import { Component, OnInit, Input } from "@angular/core";
import { FunctionalEntity, Activity } from "src/model/activity-description";
import {
  CommandLineTool,
  ExitCode,
  TerminationStatus,
  ParameterCommandLineEntryList,
  LiteralCommandLineEntryList,
  DatasetCommandLineEntryList,
  CommandLineEntryList,
} from "src/model/tool-description";

@Component({
  selector: "app-functional-entity",
  templateUrl: "./functional-entity.component.html",
  styleUrls: ["./functional-entity.component.css"],
})
export class FunctionalEntityComponent implements OnInit {
  @Input() commandLineTool: CommandLineTool;
  @Input() activity: Activity;

  detail: any = null;

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
    this.showDetails(newExitCode);
    this.commandLineTool.exitCodes.push(newExitCode);
  }

  removeExitCode(e: ExitCode) {
    let index = this.commandLineTool.exitCodes.indexOf(e);
    this.commandLineTool.exitCodes.splice(index, 1);
  }

  showDetails(e: any) {
    this.detail = e;
  }

  addLiteralCommandLineEntry() {
    let entry = new LiteralCommandLineEntryList();
    this.commandLineTool.commandLineTemplate.push(entry);
    this.showDetails(entry);
  }

  addParameterCommandLineEntry() {
    console.log("entrou");
    let entry = new ParameterCommandLineEntryList();
    this.commandLineTool.commandLineTemplate.push(entry);
    this.showDetails(entry);
    console.log("saiu");
  }

  addDatasetCommandLineEntry() {
    let entry = new DatasetCommandLineEntryList();
    this.commandLineTool.commandLineTemplate.push(entry);
    this.showDetails(entry);
  }

  remove(t: CommandLineEntryList) {
    let index = this.commandLineTool.commandLineTemplate.indexOf(t);
    this.commandLineTool.commandLineTemplate.splice(index, 1);
  }

  moveEntryListUp(t: CommandLineEntryList): void {
    let index = this.commandLineTool.commandLineTemplate.indexOf(t);
    this.remove(t);
    this.commandLineTool.commandLineTemplate.splice(index - 1, 0, t);
  }

  moveEntryListDown(t: CommandLineEntryList): void {
    let index = this.commandLineTool.commandLineTemplate.indexOf(t);
    this.remove(t);
    this.commandLineTool.commandLineTemplate.splice(index + 1, 0, t);
  }
}
