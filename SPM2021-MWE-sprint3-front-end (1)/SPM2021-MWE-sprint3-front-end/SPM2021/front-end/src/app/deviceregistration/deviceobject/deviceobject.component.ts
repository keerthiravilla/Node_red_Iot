import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from 'src/app/user-service.service';
import { User } from 'src/app/user';
import { OwlThing } from 'src/app/model/owlThing';
import { AuthenticationService } from 'src/app/authentication.service';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { RouterTestingModule } from "@angular/router/testing";
import { IotLiteObject } from 'src/app/model/iotLiteObject';
import { IotLiteAttribute } from 'src/app/model/iotLiteAttribute';

@Component({
  selector: 'app-deviceobject',
  templateUrl: './deviceobject.component.html',
  styleUrls: ['./deviceobject.component.scss']
})
export class DeviceobjectComponent  {

  owlthing:OwlThing;  
  isCollapsed = false;
  user: User;
  showMsg: boolean = false;
  userExist: boolean = false;
  iotLiteAttribute: IotLiteAttribute;
  iotLiteObject: IotLiteObject

 


  constructor(private router: Router) {

    this.owlthing = new OwlThing();
    this.iotLiteAttribute = new IotLiteAttribute();
    this.iotLiteObject= new IotLiteObject();
    this.owlthing.id = sessionStorage.getItem("id");
    this.owlthing.name= sessionStorage.getItem("name")
    this.user = new User();
    this.user.email = sessionStorage.getItem("email");

   }

   form = new FormGroup({
    IOTclass: new FormControl('', Validators.required)
  });

  get f(){
    return this.form.controls;
  }

  onSubmit() {

  }

  existUser(){
    // if(this.user.email!=''){
    //   this.userService.existUser(this.user.email).subscribe(res=>{
    //     if(res){
    //       this.userExist=true;
    //       alert("this email already exist")
    //     }else{
    //       this.userExist=false;
    //     }
    //   })
    
    // }
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
