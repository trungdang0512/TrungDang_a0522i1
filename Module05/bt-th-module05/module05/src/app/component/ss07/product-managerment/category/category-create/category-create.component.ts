import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CategoryService} from '../../../../../service/category.service';
import {Router} from '@angular/router';
import Swal from 'sweetalert2/dist/sweetalert2.js';

@Component({
  selector: 'app-category-create',
  templateUrl: './category-create.component.html',
  styleUrls: ['./category-create.component.css']
})
export class CategoryCreateComponent implements OnInit {
  categoryForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
  });

  constructor(private categoryService: CategoryService, private route: Router) { }

  ngOnInit(): void {
  }

  submit() {
    const category = this.categoryForm.value;
    this.categoryService.saveCategory(category).subscribe(next => {
      this.route.navigateByUrl('category/list');
    });
    this.categoryForm.reset();
    this.alertWithSuccess();
  }

  alertWithSuccess() {
    Swal.fire('Done', 'You submitted succesfully!', 'success');
  }
}
