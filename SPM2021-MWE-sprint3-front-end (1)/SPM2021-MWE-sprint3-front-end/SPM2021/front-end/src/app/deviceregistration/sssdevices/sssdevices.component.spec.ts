import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SssdevicesComponent } from './sssdevices.component';

describe('SssdevicesComponent', () => {
  let component: SssdevicesComponent;
  let fixture: ComponentFixture<SssdevicesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SssdevicesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SssdevicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
