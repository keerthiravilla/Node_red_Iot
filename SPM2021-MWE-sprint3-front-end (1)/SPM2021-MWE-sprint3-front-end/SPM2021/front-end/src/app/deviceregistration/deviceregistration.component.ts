import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../user-service.service';
import { User } from '../user';
import { OwlThing } from '../model/owlThing';
import { AuthenticationService } from '../authentication.service';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { RouterTestingModule } from "@angular/router/testing";

@Component({
  selector: 'app-deviceregistration',
  templateUrl: './deviceregistration.component.html',
  styleUrls: ['./deviceregistration.component.scss']
})
export class DeviceregistrationComponent{

  
    user: User;
    owlthing: OwlThing;
    showMsg: boolean = false;
    userExist: boolean = false;
    isCollapsed = false;
    IOTclass: any = ["object", "service", "Nicesnippets.com"]
   


    constructor(private router: Router) {
        this.user = new User();
        this.user.email = sessionStorage.getItem("email");
        this.owlthing =new OwlThing();        
       }

    form = new FormGroup({
      IOTclass: new FormControl('', Validators.required)
    });

    get f(){
      return this.form.controls;
    }

    onSubmit() {

    }

    public selectedOption: string;

    options = [
      { name: "Object", value: 1 },
      { name: "Service", value: 2 },
      { name: "System", value: 3 }
    ]

    public selecteddevicetype: string;

    devicetypes = [
      { name: "Sensing device", value: 1 },
      { name: "Actuating Device", value: 2 },
      { name: "Tag devices", value: 3 }
    ]

    public selectedservicetype: string;

    servicetypes = [
      { name: "Circle", value: 1 },
      { name: "Polygon", value: 2 },
      { name: "Reactangle", value: 3 }
    ]

 

    changeIOTclass(e) {
      console.log(e.target.value);
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

