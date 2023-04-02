import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2/dist/sweetalert2.js';
import {Category} from "../../../model/category";
import {FormControl, FormGroup} from "@angular/forms";
import {CategoryService} from "../../../service/category.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-category-edit',
  templateUrl: './category-edit.component.html',
  styleUrls: ['./category-edit.component.css']
})
export class CategoryEditComponent implements OnInit {
  category: Category = {};
  categoryForm: FormGroup;
  id: number;

  constructor(private categoryService: CategoryService,
              private activatedRoute: ActivatedRoute,
              private route: Router) {
    this.activatedRoute.paramMap.subscribe(next => {
      const id = next.get('id');
      if (id != null) {
        // tslint:disable-next-line:no-shadowed-variable radix
        this.categoryService.findById(parseInt(id)).subscribe(next => {
          this.category = next;
          this.categoryForm = new FormGroup({
            id: new FormControl(this.category.id),
            name: new FormControl(this.category.name),
          });
        });
      }
    }, error => {}, () => {});
  }

  ngOnInit(): void {
  }


  updateCategory(id: number) {
    const category = this.categoryForm.value;
    this.categoryService.updateCategory(this.category.id, category).subscribe(() => {
      this.alertWithSuccess();
      this.categoryForm.reset();
    });
    this.route.navigateByUrl('/category/list');
  }

  alertWithSuccess() {
    Swal.fire('Done', 'You submitted succesfully!', 'success');
  }

}
