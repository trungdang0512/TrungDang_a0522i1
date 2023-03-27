import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThTimelinesComponent } from './th-timelines.component';

describe('ThTimelinesComponent', () => {
  let component: ThTimelinesComponent;
  let fixture: ComponentFixture<ThTimelinesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThTimelinesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThTimelinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
