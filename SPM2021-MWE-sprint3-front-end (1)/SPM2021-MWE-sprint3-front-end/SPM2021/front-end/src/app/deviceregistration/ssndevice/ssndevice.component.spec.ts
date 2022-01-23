import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SsndeviceComponent } from './ssndevice.component';

describe('SsndeviceComponent', () => {
  let component: SsndeviceComponent;
  let fixture: ComponentFixture<SsndeviceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SsndeviceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SsndeviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
