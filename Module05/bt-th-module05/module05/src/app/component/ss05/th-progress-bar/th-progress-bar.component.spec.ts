import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThProgressBarComponent } from './th-progress-bar.component';

describe('ThProgressBarComponent', () => {
  let component: ThProgressBarComponent;
  let fixture: ComponentFixture<ThProgressBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThProgressBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThProgressBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
