import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeploymentModelComponent } from './deployment-model.component';

describe('DeploymentModelComponent', () => {
  let component: DeploymentModelComponent;
  let fixture: ComponentFixture<DeploymentModelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeploymentModelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeploymentModelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
