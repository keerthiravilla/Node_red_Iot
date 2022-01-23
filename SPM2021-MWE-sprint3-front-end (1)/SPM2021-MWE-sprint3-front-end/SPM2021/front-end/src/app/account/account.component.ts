import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';
import { User } from '../user';
import { UserService } from '../user-service.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.scss']
})
export class AccountComponent implements OnInit {

  user: User;
  showMsg: Boolean = false;
  updateDone = false
  userExist: boolean = false;

  constructor(private route: ActivatedRoute,
    private router: Router,
    private authenticate: AuthenticationService,
    private userService: UserService) {
      this.user = new User();
      this.user.email = sessionStorage.getItem("email");
      this.user.name = sessionStorage.getItem("name");
      this.user.password = sessionStorage.getItem("password");
      this.user.surname = sessionStorage.getItem("surname");
      this.user.id = Number(sessionStorage.getItem("id"));

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
  timeLeft: number = 2;
  interval;


  saveUser() {
    this.userService.updateUser(this.user).subscribe(data =>{
      sessionStorage.setItem("email",this.user.email);
      sessionStorage.setItem("name",this.user.name);
      sessionStorage.setItem("password",this.user.password);
      sessionStorage.setItem("surname",this.user.surname);
      this.updateDone= true;
    })
  }

  reload() {
    window.location.reload();
  }

  resetUpdateDone(){
    this.showMsg = false;
    this.updateDone= false;
  }

  existUser(){
    if(this.user.email!=''){
      console.log(this.user.email)
      console.log(sessionStorage.getItem("email"))
      
      if (this.user.email.replace(/\s/g, "") == sessionStorage.getItem("email")){
        this.userExist=false;
        this.showMsg = false;
        return
      }

      this.userService.existUser(this.user.email).subscribe(res=>{
        if(res){
          this.userExist=true;
          this.showMsg = true;

        }else{
          this.userExist=false;
          this.showMsg = false;

        }
      })
     
    }
  }


}
