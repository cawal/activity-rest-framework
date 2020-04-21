import { Component, OnInit, Input } from "@angular/core";
import { library, dom } from "@fortawesome/fontawesome-svg-core";
import {
  fas,
  faPlus,
  faTimes,
  faArrowUp,
  faArrowDown,
} from "@fortawesome/free-solid-svg-icons";

import {
  Parameter,
  InputDataset,
  OutputDataset,
} from "src/model/activity-description";
import {
  CommandLineEntryList,
  LiteralCommandLineEntryList,
  ParameterCommandLineEntryList,
  DatasetCommandLineEntryList,
} from "src/model/tool-description";

@Component({
  selector: "app-command-line-template",
  templateUrl: "./command-line-template.component.html",
  styleUrls: ["./command-line-template.component.css"],
})
export class CommandLineTemplateComponent implements OnInit {
  @Input() entryList: CommandLineEntryList;
  @Input() parameters: Parameter[];
  @Input() inputDatasets: InputDataset[];
  @Input() outputDatasets: OutputDataset[];

  iconAdd = faPlus;
  iconRemove = faTimes;
  iconUp = faArrowUp;
  iconDown = faArrowDown;

  constructor() {}

  ngOnInit() {}

  isLiteralTemplate(t: CommandLineEntryList): t is LiteralCommandLineEntryList {
    return t instanceof LiteralCommandLineEntryList;
  }

  isParameterTemplate(
    t: CommandLineEntryList
  ): t is ParameterCommandLineEntryList {
    return t instanceof ParameterCommandLineEntryList;
  }

  isDatasetTemplate(t: CommandLineEntryList): t is DatasetCommandLineEntryList {
    return t instanceof DatasetCommandLineEntryList;
  }
}
