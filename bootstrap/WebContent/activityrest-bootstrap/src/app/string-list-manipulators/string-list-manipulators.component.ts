import { Component, OnInit, Input } from "@angular/core";
import {
  StringListManipulator,
  StringListManipulatorFactory,
  Join,
  PrependEach,
  AppendEach,
  AppendListWith,
  PrependListWith,
  ToFlag,
} from "src/model/tool-description";

@Component({
  selector: "app-string-list-manipulators",
  templateUrl: "./string-list-manipulators.component.html",
  styleUrls: ["./string-list-manipulators.component.css"],
})
export class StringListManipulatorsComponent implements OnInit {
  @Input() manipulators: StringListManipulator[];
  selectedManipulatorClass: string;

  constructor() {}

  ngOnInit() {}

  add(): void {
    let m = StringListManipulatorFactory.create(this.selectedManipulatorClass);
    this.manipulators.push(m);
  }

  remove(m: StringListManipulator): StringListManipulator {
    let index = this.manipulators.indexOf(m);
    return this.manipulators.splice(index, 1)[0];
  }

  moveUp(m: StringListManipulator): void {
    let index = this.manipulators.indexOf(m);
    this.remove(m);
    this.manipulators.splice(index - 1, 0, m);
  }

  moveDown(m: StringListManipulator): void {
    let index = this.manipulators.indexOf(m);
    this.remove(m);
    this.manipulators.splice(index + 1, 0, m);
  }

  isJoin(m: StringListManipulator): m is Join {
    return m instanceof Join;
  }

  isPrependEach(m: StringListManipulator): m is PrependEach {
    return m instanceof PrependEach;
  }

  isAppendEach(m: StringListManipulator): m is AppendEach {
    return m instanceof AppendEach;
  }

  isAppendListWith(m: StringListManipulator): m is AppendListWith {
    return m instanceof AppendListWith;
  }

  isPrependListWith(m: StringListManipulator): m is PrependListWith {
    return m instanceof PrependListWith;
  }

  isToFlag(m: StringListManipulator): m is ToFlag {
    return m instanceof ToFlag;
  }
}
