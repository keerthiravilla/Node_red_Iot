import { Component, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.scss']
})
export class AboutusComponent implements OnInit {
  user: User;

  constructor() {
      this.user = new User();
      this.user.email = sessionStorage.getItem("email");

     }
  ngOnInit(): void {
  }

  logOut() {
    sessionStorage.removeItem('email');
    sessionStorage.removeItem('token');
    sessionStorage.removeItem('id');
    sessionStorage.removeItem('name');
    sessionStorage.removeItem('surname');
    console.log("LOGOUT")
  }

}
