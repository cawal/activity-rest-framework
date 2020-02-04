import { Component, OnInit, Input } from '@angular/core';
import { LiteralCommandLineEntryList } from 'src/model/tool-description';

@Component({
  selector: 'app-literal-command-line-template',
  templateUrl: './literal-command-line-template.component.html',
  styleUrls: ['./literal-command-line-template.component.css']
})
export class LiteralCommandLineTemplateComponent implements OnInit {

  @Input() literals: LiteralCommandLineEntryList;
  constructor() { }

  ngOnInit() {
  }

  addLiteral() {
    this.literals.literals.push("");
  }

  removeLiteral() {
    this.literals.literals.pop();
  }

}
