import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeviceDeatils } from './deviceDetails.component';

describe('DevicesComponent', () => {
  let component: DeviceDeatils;
  let fixture: ComponentFixture<DeviceDeatils>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeviceDeatils ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeviceDeatils);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
