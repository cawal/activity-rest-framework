import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FuctionalEntityComponent } from './fuctional-entity.component';

describe('FuctionalEntityComponent', () => {
  let component: FuctionalEntityComponent;
  let fixture: ComponentFixture<FuctionalEntityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FuctionalEntityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FuctionalEntityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
