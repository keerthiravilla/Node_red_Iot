import { GeoPoint } from "./model/geoPoint";
import { IotLiteObject } from "./model/iotLiteObject";
import { IotLiteService } from "./model/iotLiteService";
import { OwlThing } from "./model/owlThing";
import { SsnDevice } from "./model/ssnDevice";
import { SsnSystem } from "./model/ssnSystem";
import { SubClassType } from "./model/subClassType";
import { User } from "./user";

export class Device {
    owlThing: OwlThing;
    iotliteObject: IotLiteObject;
    ssnDevice: SsnDevice;
    ssnSystem: SsnSystem;
    iotLiteService: IotLiteService;
    geoPoint: GeoPoint;
    daouser: User;
    subClassType: SubClassType;
}
