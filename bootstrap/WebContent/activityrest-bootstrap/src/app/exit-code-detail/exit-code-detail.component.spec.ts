import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExitCodeDetailComponent } from './exit-code-detail.component';

describe('ExitCodeDetailComponent', () => {
  let component: ExitCodeDetailComponent;
  let fixture: ComponentFixture<ExitCodeDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExitCodeDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExitCodeDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
