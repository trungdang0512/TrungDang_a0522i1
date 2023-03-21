import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";
import {Account} from "./account";

@Component({
  selector: 'app-bt-register-form',
  templateUrl: './bt-register-form.component.html',
  styleUrls: ['./bt-register-form.component.css']
})
export class BtRegisterFormComponent implements OnInit {
  account : Account = {};
  @Output()
  eventEmmit = new EventEmitter();

  signupForm: FormGroup;

  constructor() {
    this.signupForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(6)]),
      passwordConfirm: new FormControl('',[Validators.required, Validators.minLength(6)]),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.pattern('^\\+84\\d{9,10}$')])
    }, [this.checkConfirmPass('password', 'passwordConfirm')])
  }

  ngOnInit(): void {
  }

  addNewAccount(): void {
    console.log(this.signupForm)
    if (this.signupForm.valid){
      console.log(this.signupForm.value)
      this.eventEmmit.emit(this.signupForm.value);
    }
  }

  checkConfirmPass(password1: string, confirmPass1: string) {
    return function (form: AbstractControl) {
      const pass = form.get(password1)?.value;
      const passCon = form.get(confirmPass1)?.value;
      if (pass === passCon) {
        return null
      }
      return {passConfirmError: true}
    }
  }
}
