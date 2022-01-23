import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { ServiceWorkerModule } from '@angular/service-worker';

import { environment } from '../environments/environment';
import { BasicAuthHtppInterceptorService } from './service/basic-auth-httpp-interceptor.service';
import { AuthenticationService } from './authentication.service';
import { AuthGuardComponent } from './auth-guard/auth-guard.component';
import { UserService } from './user-service.service';
import { DeviceService } from './device-service.service';

import { FormsModule } from '@angular/forms';
import { UserFormComponent } from './user-form/user-form.component';
import { CollapseModule } from 'ngx-bootstrap/collapse';
import { AccordionModule } from 'ngx-bootstrap/accordion';
import { NgxLoadingModule } from 'ngx-loading';
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { CarouselModule } from 'ngx-bootstrap/carousel';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AccountComponent } from './account/account.component';
import { DeviceregistrationComponent } from './deviceregistration/deviceregistration.component';
import { DeviceDeatils } from './deviceDeatils/deviceDetails.component';
import { AlertModule } from 'ngx-bootstrap/alert';
import { DeviceobjectComponent } from './deviceregistration/deviceobject/deviceobject.component';
import { GeopointComponent } from './deviceregistration/geopoint/geopoint.component';
import { DeviceserviceComponent } from './deviceregistration/deviceservice/deviceservice.component';
import { DeviceSystemComponent } from './deviceregistration/device-system/device-system.component';
import { SsndeviceComponent } from './deviceregistration/ssndevice/ssndevice.component';
import { SsnsensorComponent } from './deviceregistration/ssnsensor/ssnsensor.component';
import { CoverageComponent } from './deviceregistration/coverage/coverage.component';
import { AttributeComponent } from './deviceregistration/attribute/attribute.component';
import { SssdevicesComponent } from './deviceregistration/sssdevices/sssdevices.component';
import { SsndeploymentComponent } from './deviceregistration/ssndeployment/ssndeployment.component'



@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    FooterComponent,
    LoginComponent,
    UserFormComponent,
    HomeComponent,
    AboutusComponent,
    AccountComponent,
    DeviceregistrationComponent,
    DeviceDeatils,
    DeviceobjectComponent,
    GeopointComponent,
    DeviceserviceComponent,
    DeviceSystemComponent,
    SsndeviceComponent,
    SsnsensorComponent,
    CoverageComponent,
    AttributeComponent,
    SssdevicesComponent,
    SsndeploymentComponent,

  ],
  imports: [
    HttpClientModule, 
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    NgxLoadingModule.forRoot({}),
    BsDropdownModule.forRoot(),
    CollapseModule.forRoot(),
    AccordionModule.forRoot(),
    CarouselModule.forRoot(),
    AlertModule.forRoot(),
    ServiceWorkerModule.register('ngsw-worker.js', { enabled: environment.production }),


  ],
  providers: [UserService,AuthenticationService, AuthGuardComponent, DeviceService,
    {
      provide: HTTP_INTERCEPTORS, useClass:BasicAuthHtppInterceptorService, multi:true
    }
  ],
  bootstrap: [AppComponent]
})

export class AppModule 
{ 

}
