import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeviceSystemComponent } from './device-system.component';

describe('DeviceSystemComponent', () => {
  let component: DeviceSystemComponent;
  let fixture: ComponentFixture<DeviceSystemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeviceSystemComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeviceSystemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
