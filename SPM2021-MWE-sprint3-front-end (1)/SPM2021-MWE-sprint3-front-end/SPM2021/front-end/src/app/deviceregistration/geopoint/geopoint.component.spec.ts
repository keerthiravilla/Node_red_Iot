import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GeopointComponent } from './geopoint.component';

describe('GeopointComponent', () => {
  let component: GeopointComponent;
  let fixture: ComponentFixture<GeopointComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GeopointComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GeopointComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
