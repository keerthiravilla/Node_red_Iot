import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from 'src/app/user-service.service';
import { User } from 'src/app/user';
import { OwlThing } from 'src/app/model/owlThing';
import { AuthenticationService } from 'src/app/authentication.service';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { RouterTestingModule } from "@angular/router/testing";
import { IotLiteService} from 'src/app/model/iotLiteService';
import { SsnSystem } from 'src/app/model/ssnSystem';
import { SsnDevice } from 'src/app/model/ssnDevice';
import { SsnSensingDevice } from 'src/app/model/ssnSensingDevice';

@Component({
  selector: 'app-ssndevice',
  templateUrl: './ssndevice.component.html',
  styleUrls: ['./ssndevice.component.scss']
})
export class SsndeviceComponent {

  ssndevice: SsnDevice;
  user: User;
  owlthing: OwlThing;
  showMsg: boolean = false;
  userExist: boolean = false;
  isCollapsed = false;
  iotliteservice:  IotLiteService;
  ssnsystem: SsnSystem;
  ssnsensingdevice: SsnSensingDevice;
  



  constructor(private router: Router) {
    this.user = new User();
    this.user.email = sessionStorage.getItem("email");
    this.owlthing =new OwlThing();
    this.iotliteservice=new IotLiteService() 
    this.ssnsystem= new SsnSystem()       
   }

form = new FormGroup({
 
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
