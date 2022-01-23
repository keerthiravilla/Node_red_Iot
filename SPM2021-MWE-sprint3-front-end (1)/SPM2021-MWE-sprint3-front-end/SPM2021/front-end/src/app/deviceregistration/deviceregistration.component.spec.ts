import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeviceregistrationComponent } from './deviceregistration.component';
import { RouterTestingModule } from "@angular/router/testing";
import { HttpClientTestingModule } from "@angular/common/http/testing";

describe('DeviceregistrationComponent', () => {
  let component: DeviceregistrationComponent;
  let fixture: ComponentFixture<DeviceregistrationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeviceregistrationComponent ]
    })
    .compileComponents();
  });

      beforeEach(() => {
        TestBed.configureTestingModule({
        imports: [RouterTestingModule],
      });
    });
    
    beforeEach(() => {
      TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });

    
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeviceregistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
