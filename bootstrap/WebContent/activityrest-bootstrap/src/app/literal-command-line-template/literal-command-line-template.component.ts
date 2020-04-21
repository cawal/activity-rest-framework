import { library, dom } from "@fortawesome/fontawesome-svg-core";
import {
  fas,
  faPlus,
  faTimes,
  faArrowUp,
  faArrowDown,
} from "@fortawesome/free-solid-svg-icons";

import { Component, OnInit, Input } from "@angular/core";
import { LiteralCommandLineEntryList } from "src/model/tool-description";

@Component({
  selector: "app-literal-command-line-template",
  templateUrl: "./literal-command-line-template.component.html",
  styleUrls: ["./literal-command-line-template.component.css"],
})
export class LiteralCommandLineTemplateComponent implements OnInit {
  @Input() literals: LiteralCommandLineEntryList;

  iconAdd = faPlus;
  iconRemove = faTimes;
  iconUp = faArrowUp;
  iconDown = faArrowDown;

  constructor() {}

  ngOnInit() {}

  addLiteral() {
    this.literals.literals.push("");
  }

  removeLiteral(l) {
    let index = this.literals.literals.indexOf(l);
    this.literals.literals.splice(index, 1);
  }

  trackByIndex(index: number, obj: any): any {
    return index;
  }
}
