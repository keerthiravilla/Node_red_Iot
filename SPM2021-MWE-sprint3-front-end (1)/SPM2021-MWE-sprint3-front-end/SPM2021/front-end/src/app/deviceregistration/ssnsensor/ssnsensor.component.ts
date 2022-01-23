import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from 'src/app/user-service.service';
import { User } from 'src/app/user';
import { OwlThing } from 'src/app/model/owlThing';
import { AuthenticationService } from 'src/app/authentication.service';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { RouterTestingModule } from "@angular/router/testing";
import { SsnDevice } from 'src/app/model/ssnDevice';
import { SsnSensor } from 'src/app/model/ssnSensor';
import { SsnDeployment } from 'src/app/model/ssnDeployment';
import { IotLiteMetadata } from 'src/app/model/iotLiteMetadata';
import { SsnSensingDevice } from 'src/app/model/ssnSensingDevice';


@Component({
  selector: 'app-ssnsensor',
  templateUrl: './ssnsensor.component.html',
  styleUrls: ['./ssnsensor.component.scss']
})
export class SsnsensorComponent  {

  ssndevice: SsnDevice;
  user: User;
  owlthing: OwlThing;
  showMsg: boolean = false;
  userExist: boolean = false;
  isCollapsed = false;
  ssnsensor: SsnSensor;
  ssndeployement: SsnDeployment;
  iotlitemetadata: IotLiteMetadata;
  ssnsensingdevice: SsnSensingDevice;
  
  constructor(private router: Router) {
    this.user = new User();
    this.user.email = sessionStorage.getItem("email");
    this.owlthing =new OwlThing();
    this.ssnsensor= new SsnSensor();  
    this.ssndeployement=new SsnDeployment();
    this.iotlitemetadata=new IotLiteMetadata();   
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
