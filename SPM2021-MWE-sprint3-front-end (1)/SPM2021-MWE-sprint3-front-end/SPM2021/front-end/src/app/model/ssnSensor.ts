import { IotLiteMetadata } from "./iotLiteMetadata";
import { SsnDeployment } from "./ssnDeployment";

export class SsnSensor {
    id: number;
    quQuantityKind: string;    
    quUnit: string;    
    ssnDeployment: SsnDeployment;    
    iotliteMetadata: IotLiteMetadata;    

}
