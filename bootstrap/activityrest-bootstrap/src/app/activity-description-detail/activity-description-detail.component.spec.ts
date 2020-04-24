import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ActivityDescriptionDetailComponent } from './activity-description-detail.component';

describe('ActivityDescriptionDetailComponent', () => {
  let component: ActivityDescriptionDetailComponent;
  let fixture: ComponentFixture<ActivityDescriptionDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ActivityDescriptionDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ActivityDescriptionDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
