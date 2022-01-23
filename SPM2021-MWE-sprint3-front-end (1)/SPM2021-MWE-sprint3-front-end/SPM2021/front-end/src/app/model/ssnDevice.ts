import { IotLiteCoverage } from "./iotLiteCoverage";
import { IotLiteService } from "./iotLiteService";
import { SsnDeployment } from "./ssnDeployment";
import { SsnSensingDevice } from "./ssnSensingDevice";
import { SsnSystem } from "./ssnSystem";

export class SsnDevice {
    id: number;
    iotliteActuatingDevice: string;    
    iotliteTagDevice: string;    
    ssnSystem: SsnSystem;    
    iotliteCoverage: IotLiteCoverage;    
    iotliteService: IotLiteService;    
    ssnDeployment: SsnDeployment;    
    ssnSensingDevice: SsnSensingDevice;    

}
