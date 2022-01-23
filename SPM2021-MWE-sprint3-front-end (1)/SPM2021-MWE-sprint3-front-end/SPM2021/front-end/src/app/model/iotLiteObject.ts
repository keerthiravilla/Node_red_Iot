import { GeoPoint } from "./geoPoint";
import { IotLiteAttribute } from "./iotLiteAttribute";

export class IotLiteObject {
    id: number;
    iotliteInterfaceDescription: string;    
    iotLiteAttributeDTO: [IotLiteAttribute];    
    geoPoint: GeoPoint;    

}
