import { Component, OnInit, Input } from "@angular/core";

import { library, dom } from "@fortawesome/fontawesome-svg-core";
import {
  fas,
  faPlus,
  faTimes,
  faArrowUp,
  faArrowDown,
} from "@fortawesome/free-solid-svg-icons";

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
import { Lang } from '../lang';

@Component({
  selector: "app-functional-entity",
  templateUrl: "./functional-entity.component.html",
  styleUrls: ["./functional-entity.component.css"],
})
export class FunctionalEntityComponent implements OnInit {
  @Input() commandLineTool: CommandLineTool;
  @Input() activity: Activity;

  detail: any = null;

  iconAdd = faPlus;
  iconRemove = faTimes;
  iconUp = faArrowUp;
  iconDown = faArrowDown;
  lang = Lang.getInstance();

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
    let entry = new ParameterCommandLineEntryList();
    this.commandLineTool.commandLineTemplate.push(entry);
    this.showDetails(entry);
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

  getExampleCommandLine(l: CommandLineEntryList): string {
    if (l instanceof LiteralCommandLineEntryList) {
      return l.getCommandLineEntries(l.literals).join(" ");
    } else if (l instanceof ParameterCommandLineEntryList) {
      this.getParameterExample(l);
    } else if (l instanceof DatasetCommandLineEntryList) {
      this.getDatasetExample(l);
    }
  }

  getParameterExample(l: ParameterCommandLineEntryList): string {
    if (l.parameter) {
      let parameter = this.activity.parameters.find(
        (e) => e.name == l.parameter
      );
      return l.getCommandLineEntries(parameter.getExampleValues()).join(" ");
    } else {
      return "PARAMETER";
    }
  }

  getDatasetExample(l: DatasetCommandLineEntryList): string {
    if (l.dataset) {
      let dataset = this.activity.parameters.find((e) => e.name == l.dataset);
      return l.getCommandLineEntries(dataset.getExampleValues()).join(" ");
    } else {
      return "DATASET";
    }
  }
}
