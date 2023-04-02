import { Component, OnInit } from '@angular/core';
import {Todo} from "./todo";
import {FormControl} from "@angular/forms";

let _id = 1;

@Component({
  selector: 'app-th-todo-app',
  templateUrl: './th-todo-app.component.html',
  styleUrls: ['./th-todo-app.component.css']
})
export class ThTodoAppComponent implements OnInit {
  todos: Todo[] = [
    {id:1,
    content: "123",
    complete: false},
    {id:2,
      content: "1111111111",
      complete: false},
    {id:3,
      content: "22222222222222222",
      complete: false}
  ];
  content = new FormControl();

  constructor() { }

  ngOnInit(): void {
  }

  toggleTodo(i: number) {
    this.todos[i].complete = !this.todos[i].complete;
  }

  change() {
    const value = this.content.value;
    if (value) {
      const todo: Todo = {
        id: _id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.content.reset();
    }
  }
}
