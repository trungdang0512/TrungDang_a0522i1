import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThTodoAppComponent } from './th-todo-app.component';

describe('ThTodoAppComponent', () => {
  let component: ThTodoAppComponent;
  let fixture: ComponentFixture<ThTodoAppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThTodoAppComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThTodoAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
