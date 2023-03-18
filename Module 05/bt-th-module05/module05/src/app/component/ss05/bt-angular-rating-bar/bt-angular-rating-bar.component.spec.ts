import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BtAngularRatingBarComponent } from './bt-angular-rating-bar.component';

describe('BtAngularRatingBarComponent', () => {
  let component: BtAngularRatingBarComponent;
  let fixture: ComponentFixture<BtAngularRatingBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BtAngularRatingBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BtAngularRatingBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
