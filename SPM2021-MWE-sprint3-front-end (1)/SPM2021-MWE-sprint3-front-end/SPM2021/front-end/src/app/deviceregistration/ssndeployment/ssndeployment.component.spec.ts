import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SsndeploymentComponent } from './ssndeployment.component';

describe('SsndeploymentComponent', () => {
  let component: SsndeploymentComponent;
  let fixture: ComponentFixture<SsndeploymentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SsndeploymentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SsndeploymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
