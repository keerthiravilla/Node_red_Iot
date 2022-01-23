import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Device } from './device';
import { Observable } from 'rxjs';
import { HomeDevice } from './homeDevice';
 

@Injectable()
export class DeviceService {
 
  private deviceUrl: string
  private id: string

  private paramId: String

  constructor(private http: HttpClient) {
    this.deviceUrl = 'http://localhost:8080/';
    
    
  }

  
 /*
  public save(user: User) {
    return this.http.post<User>(this.userUrl+"user", user);
  }

  public callUserEmergenza():Observable<User[]> {
    
    return this.http.get<User[]>(this.userUrl+ "users");
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.userUrl+ "users");
  }

  public existUser(email: string) {
    return this.http.get<boolean>(this.userUrl+"existUser/"+email);
  }
  */


  // public findAll(): Observable<Device[]> {
  //   this.id = sessionStorage.getItem("id");
  //   console.log(this.id);
  //   return this.http.get<Device[]>(this.deviceUrl+ "devices/userId/" + this.id);
  // }
  public storeData(id : String){
    this.paramId = id
  }

  public retriveData(): String{
    return this.paramId;
  }

  public findAll(): Observable<HomeDevice[]> {
    this.id = sessionStorage.getItem("id");
    console.log(this.id);
    const params = new HttpParams()
    .set('id', this.id);
    return this.http.get<HomeDevice[]>(this.deviceUrl+ "devices", {params});
  }

  public getDevice(id: string): Observable<Device> {
    const params = new HttpParams()
    .set('id', id);
    return this.http.get<Device>(this.deviceUrl+ "device", {params});
  }

}