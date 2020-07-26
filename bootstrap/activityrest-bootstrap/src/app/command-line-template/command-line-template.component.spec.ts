import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CommandLineTemplateComponent } from './command-line-template.component';

describe('CommandLineTemplateComponent', () => {
  let component: CommandLineTemplateComponent;
  let fixture: ComponentFixture<CommandLineTemplateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CommandLineTemplateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CommandLineTemplateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
