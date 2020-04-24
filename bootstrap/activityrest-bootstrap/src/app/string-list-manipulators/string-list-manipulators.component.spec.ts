import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StringListManipulatorsComponent } from './string-list-manipulators.component';

describe('StringListManipulatorsComponent', () => {
  let component: StringListManipulatorsComponent;
  let fixture: ComponentFixture<StringListManipulatorsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StringListManipulatorsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StringListManipulatorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
