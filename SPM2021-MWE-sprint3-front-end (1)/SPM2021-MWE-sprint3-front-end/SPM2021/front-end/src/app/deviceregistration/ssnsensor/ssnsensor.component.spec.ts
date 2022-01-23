import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SsnsensorComponent } from './ssnsensor.component';

describe('SsnsensorComponent', () => {
  let component: SsnsensorComponent;
  let fixture: ComponentFixture<SsnsensorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SsnsensorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SsnsensorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
