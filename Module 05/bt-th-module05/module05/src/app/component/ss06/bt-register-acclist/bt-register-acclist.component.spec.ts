import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BtRegisterAcclistComponent } from './bt-register-acclist.component';

describe('BtRegisterAcclistComponent', () => {
  let component: BtRegisterAcclistComponent;
  let fixture: ComponentFixture<BtRegisterAcclistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BtRegisterAcclistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BtRegisterAcclistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
