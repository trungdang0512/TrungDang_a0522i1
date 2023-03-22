import { Component, OnInit } from '@angular/core';
import {LoginAccount} from "./login-account";
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-bt-login',
  templateUrl: './bt-login.component.html',
  styleUrls: ['./bt-login.component.css']
})
export class BtLoginComponent implements OnInit {
  loginAccount : LoginAccount ={
    email: "admin@123.com",
    password: "123456"
  }

  signInForm : FormGroup;

  constructor() {
    this.signInForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('',[Validators.minLength(6)])
    },[this.checkPassword('password', this.loginAccount.password),
      this.checkEmail('email', this.loginAccount.email)])
  }

  ngOnInit(): void {
  }

  checkEmail(email: string, emailTrue: string) {
    return function (form: AbstractControl) {
      const pass = form.get(email)?.value;
      if (pass === emailTrue) {
        return null
      }
      return {emailConfirmError: true}
    }
  }

  checkPassword(password1: string, confirmPass1: string) {
    return function (form: AbstractControl) {
      const pass = form.get(password1)?.value;
      if (pass === confirmPass1) {
        return null
      }
      return {passConfirmError: true}
    }
  }

  signIn() {
    console.log("Login Successfully!!!!!")
  }
}






