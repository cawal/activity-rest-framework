import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LiteralCommandLineTemplateComponent } from './literal-command-line-template.component';

describe('LiteralCommandLineTemplateComponent', () => {
  let component: LiteralCommandLineTemplateComponent;
  let fixture: ComponentFixture<LiteralCommandLineTemplateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LiteralCommandLineTemplateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LiteralCommandLineTemplateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
