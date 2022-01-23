import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';

@Component({
    selector: 'login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']

})

export class LoginComponent implements OnInit {

    email = ''
    password = ''
    invalidLogin = false
    showMsg: boolean = false;


    constructor(private router: Router,
        private loginservice: AuthenticationService) { }

    ngOnInit() {
    }

    existUser(){
      this.invalidLogin = false
    }

    checkLogin() {
        (this.loginservice.authenticate(this.email, this.password).subscribe(
          data => {
            this.router.navigate(['/home'])
            this.invalidLogin = false
          },
          error => {
            this.invalidLogin = true
          }
        )
        );
    
      }
    }
    