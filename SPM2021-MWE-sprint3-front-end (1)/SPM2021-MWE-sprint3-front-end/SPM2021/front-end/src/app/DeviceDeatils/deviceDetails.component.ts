import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Device } from '../device';
import { DeviceService } from '../device-service.service';
import { GeoPoint } from '../model/geoPoint';
import { IotLiteAttribute } from '../model/iotLiteAttribute';
import { IotLiteCircle } from '../model/iotLiteCircle';
import { IotLiteCoverage } from '../model/iotLiteCoverage';
import { IotLiteMetadata } from '../model/iotLiteMetadata';
import { IotLiteObject } from '../model/iotLiteObject';
import { IotLiteService } from '../model/iotLiteService';
import { OwlThing } from '../model/owlThing';
import { SsnDeployment } from '../model/ssnDeployment';
import { SsnDevice } from '../model/ssnDevice';
import { SsnSensingDevice } from '../model/ssnSensingDevice';
import { SsnSensor } from '../model/ssnSensor';
import { SsnSystem } from '../model/ssnSystem';
import { SubClassType } from '../model/subClassType';
import { User } from '../user';

@Component({
  selector: 'app-devices',
  templateUrl: './deviceDetails.component.html',
  styleUrls: ['./deviceDetails.component.scss']
})
export class DeviceDeatils implements OnInit {

  device: Device;
  owlThing: OwlThing;
  iotLiteObject: IotLiteObject;
  iotLiteService: IotLiteService;
  ssnSystem: SsnSystem;

  iotLiteAttribute: [IotLiteAttribute];
  showModal : boolean = false;


  ssnDevice: SsnDevice;
  geoPoint: GeoPoint;
  geoPointFromObject: GeoPoint;
  subClassType: SubClassType;

  ssnDeploymentFromGeoPointObject: SsnDeployment;
  iotLiteCoverageFromGeoPointObject: IotLiteCoverage;
  iotLiteCircleFromGeoPointObject: IotLiteCircle;

  iotLiteCoverageFromSsnDevice: IotLiteCoverage;
  iotLiteCircleFromSsnDevice: IotLiteCircle;
  iotLiteServiceFromSsnDevice: IotLiteService;
  ssnDeploymentFromSsnDevice: SsnDeployment;
  ssnSensingDeviceFromSsnDevice: SsnSensingDevice;
  ssnSensorDeviceFromSsnDevice: SsnSensor;
  ssnDeploymentDeviceFromSsnDeviceSsnSensor: SsnDeployment;
  iotLiteMetadataSsnSensor: IotLiteMetadata;
  geoPointFromCoverage: GeoPoint;
  geoPointFromDeployment: GeoPoint;

  ssnDeploymentFromGeoPointCoverage: SsnDeployment;
  ssnDeploymentFromGeoPointDeployment: SsnDeployment;

  iotLiteCoverageFromGeoPointCoverage: IotLiteCoverage;
  iotLiteCircleFromGeoPointCoverage: IotLiteCircle;
  iotLiteCoverageFromGeoPointDeployment: IotLiteCoverage;
  iotLiteCircleFromGeoPointDeployment: IotLiteCircle;
  user: User;
  id: String;

  constructor(private deviceServcie: DeviceService,
    private router: Router) {
    this.device = new Device();
    this.user = new User();
  }


  ngOnInit() {
    this.user.email = sessionStorage.getItem("email");
    this.id = this.deviceServcie.retriveData();
    if (this.id != null){
      sessionStorage.setItem("idForDevice", String(this.id));
    }else{
      this.id = sessionStorage.getItem("idForDevice");
    }
    console.log(this.id)
    this.getId()
  }

  isGeoPointShow(){
    if (this.geoPoint == null){
      return false
    }else{
      return true
    }
  }


  isSsnSystemShow(){
    if (this.ssnSystem == null){
      return false
    }else{
      return true
    }
  }

  isIotLiteServiceShow(){
    if (this.iotLiteService == null){
      return false
    }else{
      return true
    }
  }

  isGeoPointFromObjectShow(){
    console.log("geoPointFromObject = FALSE")

    if (this.geoPointFromObject == null){
      console.log("geoPointFromObject = FALSE")
      return false
    }else{
      console.log("geoPointFromObject = FALSE")
      return true
    }
  }

  isIotLiteObjectShow(){
    if (this.iotLiteObject == null){
      console.log("LITE OBEC = FALSE")
      return false
    }else{
      console.log("LITE OBEC = TRUE")
      return true

    }
  }

  isSsnDeploymentFromGeoPointObjectShow(){
    if (this.ssnDeploymentFromGeoPointObject == null){
      return false
    }else{
      return true
    }
  }

  isIotLiteCoverageFromGeoPointObjectShow(){
    if (this.iotLiteCoverageFromGeoPointObject == null){
      console.log("iotLiteCoverageFromGeoPointObject = FALSE")
      return false
    }else{
      console.log("iotLiteCoverageFromGeoPointObject = TRUE")

      return true
    }
  }

  isIotLiteCircleFromGeoPointObjectShow(){
    if (this.iotLiteCircleFromGeoPointObject == null){
      return false
    }else{
      return true
    }
  }

  isSsnDeviceShow(){
    if (this.ssnDevice == null){
      return false
    }else{
      return true
    }
  }

  isIotLiteCoverageFromSsnDeviceShow(){
    if (this.iotLiteCoverageFromSsnDevice == null){
      return false
    }else{
      return true
    }
  }


  isIotLiteCircleFromSsnDeviceShow(){
    if (this.iotLiteCircleFromSsnDevice == null){
      return false
    }else{
      return true
    }
  }

  isIotLiteServiceFromSsnDeviceShow(){
    if (this.iotLiteServiceFromSsnDevice == null){
      return false
    }else{
      return true
    }
  }

  isSsnDeplymentFromSsnDeviceShow(){
    if (this.ssnDeploymentFromSsnDevice == null){
      return false
    }else{
      return true
    }
  }

  isSsnSensingDeviceIsShow(){
    if (this.ssnSensingDeviceFromSsnDevice == null){
      return false
    }else{
      return true
    }
  }

  isSsnSensorIsShow(){
    if (this.ssnSensorDeviceFromSsnDevice == null){
      return false
    }else{
      return true
    }
  }

  isSsnDeploymentDeviceFromSsnDeviceSsnSensorShow(){
    if (this.ssnDeploymentDeviceFromSsnDeviceSsnSensor == null){
      return false
    }else{
      return true
    }
  }

  isIotLiteMetadataShow(){
    if (this.iotLiteMetadataSsnSensor == null){
      return false
    }else{
      return true
    }
  }

  isGeoPointFromDeploymentShow(){
    if (this.geoPointFromDeployment == null){
      return false
    }else{
      return true
    }
  }

  isGeoPointFromCoverageShow(){
    if (this.geoPointFromCoverage == null){
      console.log("geoPointFromCoverage = FALSE")
      return false
    }else{
      console.log("geoPointFromCoverage = TRUE")

      return true
    }
  }

  isIotLiteCoverageFromGeoPointCoverageShow(){
    if (this.iotLiteCoverageFromGeoPointCoverage == null){
      return false
    }else{
      return true
    }
  }

  isIotLiteCircleFromGeoPointCoverageShow(){
    if (this.iotLiteCircleFromGeoPointCoverage == null){
      return false
    }else{
      return true
    }
  }

  isIotLiteCoverageFromGeoPointDeploymentShow(){
    if (this.iotLiteCoverageFromGeoPointDeployment == null){
      return false
    }else{
      return true
    }
  }

  isIotLiteCircleFromGeoPointDeploymentShow(){
    if (this.iotLiteCircleFromGeoPointDeployment == null){
      return false
    }else{
      return true
    }
  }

  isSsnDeploymentFromGeoPointCoverageShow(){
    if (this.ssnDeploymentFromGeoPointCoverage == null){
      return false
    }else{
      return true
    }
  }

  isSsnDeploymentFromGeoPointDeploymentShow(){
    if (this.ssnDeploymentFromGeoPointDeployment == null){
      return false
    }else{
      return true
    }
  }

  showPopUp(){
    this.showModal = true
    console.log("showww")
  }

  hidePopUp(){
    this.showModal = false;
  }

  getId(){
    console.log(this.id)
    this.getDevice()
  }

  getDevice(){
    this.deviceServcie.getDevice(this.id.toString()).subscribe(response => {
      this.owlThing = response.owlThing
      this.geoPoint = response.geoPoint
      this.subClassType = response.subClassType

      this.iotLiteService = response.iotLiteService
      this.ssnSystem = response.ssnSystem

      //IOT LITE OBJECT && GEO POINT
      this.iotLiteObject = response.iotliteObject
      if (response.iotliteObject != null){
        this.iotLiteAttribute = response.iotliteObject.iotLiteAttributeDTO
        this.geoPointFromObject = response.iotliteObject.geoPoint;
        if (this.geoPointFromObject != null){
          if (this.geoPointFromObject.longg == null){
            this.geoPointFromObject.longg = "--"
          }
          this.ssnDeploymentFromGeoPointObject = this.geoPointFromObject.ssnDeployment
          this.iotLiteCoverageFromGeoPointObject = this.geoPointFromObject.iotlitecoverage
          if (this.iotLiteCoverageFromGeoPointObject != null){
            this.iotLiteCircleFromGeoPointObject = this.iotLiteCoverageFromGeoPointObject.iotliteCircle
          }
        }
      }
  


      //SSN DEVICE
      this.ssnDevice = response.ssnDevice

      if (this.ssnDevice != null){
        this.iotLiteCoverageFromSsnDevice = this.ssnDevice.iotliteCoverage
        if (this.iotLiteCoverageFromSsnDevice != null){
          this.iotLiteCircleFromSsnDevice = this.iotLiteCoverageFromSsnDevice.iotliteCircle
          this.geoPointFromCoverage = this.iotLiteCoverageFromSsnDevice.geoPoint
          if (this.geoPointFromCoverage != null){
            this.iotLiteCoverageFromGeoPointCoverage = this.geoPointFromCoverage.iotlitecoverage
            this.ssnDeploymentFromGeoPointCoverage = this.geoPointFromCoverage.ssnDeployment

            if (this.iotLiteCoverageFromGeoPointCoverage != null){
              this.iotLiteCircleFromGeoPointCoverage = this.iotLiteCoverageFromGeoPointCoverage.iotliteCircle
            }
            
          }
        }
        this.iotLiteServiceFromSsnDevice = this.ssnDevice.iotliteService
        this.ssnDeploymentFromSsnDevice = this.ssnDevice.ssnDeployment
        if (this.ssnDeploymentFromSsnDevice != null){
          this.geoPointFromDeployment = this.ssnDeploymentFromSsnDevice.geoPoint
          if (this.geoPointFromDeployment != null){
            this.iotLiteCoverageFromGeoPointDeployment = this.geoPointFromDeployment.iotlitecoverage
            this.ssnDeploymentFromGeoPointDeployment = this.geoPointFromDeployment.ssnDeployment

            if (this.iotLiteCoverageFromGeoPointDeployment != null){
              this.iotLiteCircleFromGeoPointDeployment = this.iotLiteCoverageFromGeoPointDeployment.iotliteCircle
            }
          }
        }
        this.ssnSensingDeviceFromSsnDevice = this.ssnDevice.ssnSensingDevice
        if (this.ssnSensingDeviceFromSsnDevice != null){
          this.ssnSensorDeviceFromSsnDevice = this.ssnSensingDeviceFromSsnDevice.ssnSensor
          if (this.ssnSensorDeviceFromSsnDevice != null){
            this.ssnDeploymentDeviceFromSsnDeviceSsnSensor = this.ssnSensorDeviceFromSsnDevice.ssnDeployment
            this.iotLiteMetadataSsnSensor = this.ssnSensorDeviceFromSsnDevice.iotliteMetadata
          }
        }



      }
      console.log(response);

      console.log("FINITOO!");

    });
    console.log(this.id)
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
