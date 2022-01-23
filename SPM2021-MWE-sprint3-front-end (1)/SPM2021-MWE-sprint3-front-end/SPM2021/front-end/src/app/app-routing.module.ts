import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserFormComponent } from './user-form/user-form.component';
import { LoginComponent } from './login/login.component';
import { AuthenticationService } from './authentication.service';
import { AuthGuardComponent } from './auth-guard/auth-guard.component';
import { HomeComponent } from './home/home.component';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AccountComponent } from './account/account.component';
import { DeviceregistrationComponent } from './deviceregistration/deviceregistration.component';
import { DeviceDeatils } from './deviceDeatils/deviceDetails.component';
import { DeviceobjectComponent } from './deviceregistration/deviceobject/deviceobject.component';
import { GeopointComponent } from './deviceregistration/geopoint/geopoint.component';
import { DeviceserviceComponent } from './deviceregistration/deviceservice/deviceservice.component';
import { DeviceSystemComponent } from './deviceregistration/device-system/device-system.component';
import { SsnDevice } from './model/ssnDevice';
import { SsndeviceComponent } from './deviceregistration/ssndevice/ssndevice.component';
import { SsnSensor } from './model/ssnSensor';
import { SsnsensorComponent } from './deviceregistration/ssnsensor/ssnsensor.component';
import { CoverageComponent } from './deviceregistration/coverage/coverage.component';
import {AttributeComponent} from './deviceregistration/attribute/attribute.component';
import {SssdevicesComponent } from './deviceregistration/sssdevices/sssdevices.component';
import { SsndeploymentComponent } from './deviceregistration/ssndeployment/ssndeployment.component';


const routes: Routes = [
  { path: '',   redirectTo: '/login', pathMatch: 'full' },
  { path: 'registration', component: UserFormComponent },
  { path: 'login', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path:'toolbar', component: ToolbarComponent},
  { path:'aboutus', component: AboutusComponent},
  { path:'account', component: AccountComponent},
  { path:'registerdevice',component: DeviceregistrationComponent},
  { path:'deviceDetails', component: DeviceDeatils},
  { path:'registerdevice/deviceobject', component: DeviceobjectComponent},
  {path:'registerdevice/geopoint', component: GeopointComponent},
  {path:'registerdevice/deviceservice', component:DeviceserviceComponent},
  {path: 'registerdevice/ssnsystem', component: DeviceSystemComponent},
  {path:'registerdevice/ssndevice', component: SsndeviceComponent},
  {path:'registerdevice/ssnsensor', component: SsnsensorComponent},
  {path:'registerdevice/coverage', component: CoverageComponent},
  {path:'registerdevice/attribute', component: AttributeComponent},
  {path:'registerdevice/sssdeviceservice', component: SssdevicesComponent},
  {path:'registerdevice/ssndeployement', component: SsndeploymentComponent}

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],  
  exports: [RouterModule]
})
export class AppRoutingModule { }
