import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FunctionalEntityDetailComponent } from './functional-entity-detail.component';

describe('FunctionalEntityDetailComponent', () => {
  let component: FunctionalEntityDetailComponent;
  let fixture: ComponentFixture<FunctionalEntityDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FunctionalEntityDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FunctionalEntityDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
