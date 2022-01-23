import { GeoPoint } from "./geoPoint";
import { IotLiteCircle } from "./iotLiteCircle";

export class IotLiteCoverage {
    id: number;
    iotliteRectangle: string;    
    iotlitePolygon: string;    
    iotliteCircle: IotLiteCircle;    
    geoPoint: GeoPoint;    

}
