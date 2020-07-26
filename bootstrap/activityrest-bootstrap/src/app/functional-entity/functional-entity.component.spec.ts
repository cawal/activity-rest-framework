import { async, ComponentFixture, TestBed } from "@angular/core/testing";

import { FunctionalEntityComponent } from "./functional-entity.component";

describe("functionalEntityComponent", () => {
  let component: FunctionalEntityComponent;
  let fixture: ComponentFixture<FunctionalEntityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [FunctionalEntityComponent]
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FunctionalEntityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it("should create", () => {
    expect(component).toBeTruthy();
  });
});
