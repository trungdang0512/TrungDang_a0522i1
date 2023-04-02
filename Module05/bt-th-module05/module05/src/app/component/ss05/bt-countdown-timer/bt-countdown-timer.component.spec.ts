import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BtCountdownTimerComponent } from './bt-countdown-timer.component';

describe('BtCountdownTimerComponent', () => {
  let component: BtCountdownTimerComponent;
  let fixture: ComponentFixture<BtCountdownTimerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BtCountdownTimerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BtCountdownTimerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
