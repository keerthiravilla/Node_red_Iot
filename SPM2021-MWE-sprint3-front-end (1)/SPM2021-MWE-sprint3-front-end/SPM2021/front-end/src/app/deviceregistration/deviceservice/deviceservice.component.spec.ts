import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeviceserviceComponent } from './deviceservice.component';

describe('DeviceserviceComponent', () => {
  let component: DeviceserviceComponent;
  let fixture: ComponentFixture<DeviceserviceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeviceserviceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeviceserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
