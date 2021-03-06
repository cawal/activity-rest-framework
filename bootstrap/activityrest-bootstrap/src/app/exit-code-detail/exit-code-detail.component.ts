import { Component, OnInit, Input } from "@angular/core";
import { ExitCode, TerminationStatus } from "src/model/tool-description";
import { Lang } from "../lang";

@Component({
  selector: "app-exit-code-detail",
  templateUrl: "./exit-code-detail.component.html",
  styleUrls: ["./exit-code-detail.component.css"],
})
export class ExitCodeDetailComponent implements OnInit {
  @Input() exitCode: ExitCode;
  keys = Object.keys;
  terminationStatus = TerminationStatus;

  lang: Lang = Lang.getInstance();

  constructor() {}

  ngOnInit() {}
}
