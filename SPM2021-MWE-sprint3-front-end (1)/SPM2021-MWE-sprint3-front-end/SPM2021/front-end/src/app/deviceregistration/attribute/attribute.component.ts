import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from 'src/app/user-service.service';
import { User } from 'src/app/user';
import { OwlThing } from 'src/app/model/owlThing';
import { AuthenticationService } from 'src/app/authentication.service';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { RouterTestingModule } from "@angular/router/testing";
import { IotLiteAttribute } from 'src/app/model/iotLiteAttribute';

@Component({
  selector: 'app-attribute',
  templateUrl: './attribute.component.html',
  styleUrls: ['./attribute.component.scss']
})
export class AttributeComponent {

  user: User;
  owlthing: OwlThing;
  showMsg: boolean = false;
  userExist: boolean = false;
  isCollapsed = false;
  iotliteattribute: IotLiteAttribute;
  deviceselection: any = ["object", "service", "Nicesnippets.com"]
  
  constructor(private router: Router) {
    this.user = new User();
    this.user.email = sessionStorage.getItem("email");
    this.owlthing =new OwlThing(); 
    this.iotliteattribute= new IotLiteAttribute();
   }

   form = new FormGroup({
      deviceselection: new FormControl('', Validators.required)
  });

get f(){
  return this.form.controls;
}

onSubmit() {

}

public selectedOption: string;

  options = [
    { name: "Yes", value: 1 },
    { name: "No", value: 2 }    
  ]
  



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
