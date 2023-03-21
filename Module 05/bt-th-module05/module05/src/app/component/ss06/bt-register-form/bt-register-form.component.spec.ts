import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BtRegisterFormComponent } from './bt-register-form.component';

describe('BtRegisterFormComponent', () => {
  let component: BtRegisterFormComponent;
  let fixture: ComponentFixture<BtRegisterFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BtRegisterFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BtRegisterFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
