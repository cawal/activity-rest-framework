import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtifactsGenerationComponent } from './artifacts-generation.component';

describe('ArtifactsGenerationComponent', () => {
  let component: ArtifactsGenerationComponent;
  let fixture: ComponentFixture<ArtifactsGenerationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ArtifactsGenerationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ArtifactsGenerationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
