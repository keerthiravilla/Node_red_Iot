import { Component, OnInit } from '@angular/core';
import { UserService } from '../user-service.service';
import { User } from '../user';
import { HomeDevice } from '../homeDevice';

import { ActivatedRoute, Router } from '@angular/router';
import { DeviceService } from '../device-service.service';
import { SubClassType } from '../model/subClassType';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  showMsg: boolean = false;
  users: User[];
  user: User;
  devices: HomeDevice[];
  device: HomeDevice;
  subClassType: [SubClassType];
  objectImg = "./assets/images/Object.png";
  systemImg = "./assets/images/System.png";
  serviceImg = "./assets/images/Service.png";

  constructor(private deviceServcie: DeviceService,
              private router: Router) {
                this.device = new HomeDevice();
                this.user = new User();
                this.user.email = sessionStorage.getItem("email");

               }

  ngOnInit() {
    console.log("init")

    this.deviceServcie.findAll().subscribe(data =>{
      this.devices = data;
      for (let index = 0; index < data.length; index++) {
        this.subClassType.concat(data[index].subClassType) 
      }
    });
    
    
    // this.UserService.findById(Number(sessionStorage.getItem("id"))).subscribe(data =>{
    //   this.user = data;
    // });
    
    
  }

  getImage(homeDevice: HomeDevice) {
    if (homeDevice.subClassType.name.toUpperCase() == "OBJECT"){
      console.log("OBJECT")
      return this.objectImg
    }else if (homeDevice.subClassType.name.toUpperCase() == "SYSTEM"){
      console.log("SYSTEM")
      return this.systemImg
    }else{
      console.log("SERVICE")
      return this.serviceImg
    }
  }

  goToDetails(id: Number) {
    // console.log(id)
    this.deviceServcie.storeData(String(id))
    this.router.navigate(["deviceDetails"]);
    this.deviceServcie
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