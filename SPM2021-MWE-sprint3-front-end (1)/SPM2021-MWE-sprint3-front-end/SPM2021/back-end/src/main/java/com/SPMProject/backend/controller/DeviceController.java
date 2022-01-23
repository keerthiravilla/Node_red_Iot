package com.SPMProject.backend.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.SPMProject.backend.dto.ApiResponseDTO;
import com.SPMProject.backend.dto.DeviceDTO;
import com.SPMProject.backend.dto.GeoPointDTO;
import com.SPMProject.backend.dto.ID;
import com.SPMProject.backend.dto.IotLiteAttributeDTO;
import com.SPMProject.backend.dto.IotLiteCoverageDTO;
import com.SPMProject.backend.dto.IotLiteObjectDTO;
import com.SPMProject.backend.dto.IotLiteServiceDTO;
import com.SPMProject.backend.dto.OwlThingDTO;
import com.SPMProject.backend.dto.SsnDeploymentDTO;
import com.SPMProject.backend.dto.SsnDeviceDTO;
import com.SPMProject.backend.dto.SsnSystemDTO;
import com.SPMProject.backend.entityModel.DAOUser;
import com.SPMProject.backend.entityModel.OwlThing;
import com.SPMProject.backend.entityModel.SubClassType;
import com.SPMProject.backend.entityModel.geoPoint;
import com.SPMProject.backend.entityModel.iotliteAttribute;
import com.SPMProject.backend.entityModel.iotliteCircle;
import com.SPMProject.backend.entityModel.iotliteCoverage;
import com.SPMProject.backend.entityModel.iotliteMetadata;
import com.SPMProject.backend.entityModel.iotliteObject;
import com.SPMProject.backend.entityModel.iotliteService;
import com.SPMProject.backend.entityModel.ssnDeployment;
import com.SPMProject.backend.entityModel.ssnDevice;
import com.SPMProject.backend.entityModel.ssnSensingDevice;
import com.SPMProject.backend.entityModel.ssnSensor;
import com.SPMProject.backend.entityModel.ssnSystem;
import com.SPMProject.backend.repository.OwlThingRepository;
import com.SPMProject.backend.repository.SubClassTypeRepository;
import com.SPMProject.backend.repository.UserDao;
import com.SPMProject.backend.repository.geoPointRepository;
import com.SPMProject.backend.repository.iotliteAttributeRepository;
import com.SPMProject.backend.repository.iotliteCircleRepository;
import com.SPMProject.backend.repository.iotliteCoverageRepository;
import com.SPMProject.backend.repository.iotliteMetadataRepository;
import com.SPMProject.backend.repository.iotliteObjectRepository;
import com.SPMProject.backend.repository.iotliteServiceRepository;
import com.SPMProject.backend.repository.ssnDeploymentRepository;
import com.SPMProject.backend.repository.ssnDeviceRepository;
import com.SPMProject.backend.repository.ssnSensingDeviceRepository;
import com.SPMProject.backend.repository.ssnSensorRepository;
import com.SPMProject.backend.repository.ssnSystemRepository;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DeviceController {

    public DeviceController(
        OwlThingRepository owlThingRepository, 
        iotliteObjectRepository iotliteObjectRepository, 
        iotliteAttributeRepository iotliteAttributeRepository,
        ssnDeviceRepository ssnDeviceRepository,
        ssnSensingDeviceRepository ssnSensingDeviceRepository,
        iotliteCoverageRepository iotliteCoverageRepository,
        iotliteCircleRepository iotliteCircleRepository,
        ssnSystemRepository ssnSystemRepository,
        geoPointRepository geoPointRepository,
        ssnDeploymentRepository ssnDeploymentRepository,
        iotliteServiceRepository iotliteServiceRepository,
        ssnSensorRepository ssnSensorRepository,
        iotliteMetadataRepository iotliteMetadataRepository,
        SubClassTypeRepository subClassTypeRepository,
        UserDao userDaoRepository
    ) 
    {
        this.owlThingRepository = owlThingRepository;
        this.iotliteObjectRepository = iotliteObjectRepository;
        this.iotliteAttributeRepository=iotliteAttributeRepository;
        this.ssnDeviceRepository=ssnDeviceRepository;
        this.ssnSensingDeviceRepository=ssnSensingDeviceRepository;
        this.iotliteCoverageRepository=iotliteCoverageRepository;
        this.iotliteCircleRepository=iotliteCircleRepository;
        this.ssnSystemRepository=ssnSystemRepository;
        this.geoPointRepository=geoPointRepository;
        this.ssnDeploymentRepository=ssnDeploymentRepository;
        this.iotliteServiceRepository=iotliteServiceRepository;
        this.ssnSensorRepository=ssnSensorRepository;
        this.iotliteMetadataRepository=iotliteMetadataRepository;
        this.subClassTypeRepository = subClassTypeRepository;
        this.userDaoRepository = userDaoRepository;
    }


    @Autowired
    private UserDao userDaoRepository;
    @Autowired
    private OwlThingRepository owlThingRepository;
    @Autowired
    private SubClassTypeRepository subClassTypeRepository;
    @Autowired
    private iotliteObjectRepository iotliteObjectRepository;
    @Autowired
    private iotliteAttributeRepository iotliteAttributeRepository;
    @Autowired
    private ssnDeviceRepository ssnDeviceRepository;
    @Autowired
    private ssnSensingDeviceRepository ssnSensingDeviceRepository;
    @Autowired
    private iotliteCoverageRepository iotliteCoverageRepository;
    @Autowired
    private iotliteCircleRepository iotliteCircleRepository;
    @Autowired
    private ssnSystemRepository ssnSystemRepository;
    @Autowired
    private geoPointRepository geoPointRepository;
    @Autowired
    private ssnDeploymentRepository ssnDeploymentRepository;
    @Autowired
    private iotliteServiceRepository iotliteServiceRepository;
    @Autowired
    private ssnSensorRepository ssnSensorRepository;
    @Autowired
    private iotliteMetadataRepository iotliteMetadataRepository;
    @Autowired
    private UserDao userDao;

    @GetMapping("/device")
    DeviceDTO getDevices(@RequestParam Long id) {
        DeviceDTO deviceDTO = new DeviceDTO();

        //OWL THING
        OwlThing owlThing = owlThingRepository.findById(id).orElse(new OwlThing());
        OwlThingDTO owlThingDTO = new OwlThingDTO();
        owlThingDTO.setId(owlThing.getId());
        owlThingDTO.setName(owlThing.getName());
        deviceDTO.setOwlThing(owlThingDTO);

        //USER
        DAOUser DAOUser = new DAOUser();
        DAOUser = owlThing.getDAOUser();
        deviceDTO.setDAOUser(DAOUser);


        //SUBCLASS TYPE
        SubClassType subClass = new SubClassType();
        subClass = owlThing.getSubClassType();
        deviceDTO.setSubClassType(subClass);
        
        


        switch (subClass.getName().toUpperCase()){
        case "OBJECT":
            //IOT LITE OBJECT AND ATTRIBUTE 
            iotliteObject iotliteObject = iotliteObjectRepository.findByOwlThing(owlThing);
            List<iotliteAttribute> iotliteAttribute = iotliteAttributeRepository.findAlliotliteAttributeByiotliteObject(iotliteObject);
            IotLiteObjectDTO iotLiteObjectDTO = new IotLiteObjectDTO();
            geoPoint geoPoint = new geoPoint();
            if (iotliteObject != null){
                iotLiteObjectDTO.setId(iotliteObject.getId());
                iotLiteObjectDTO.setIotliteInterfaceDescription(iotliteObject.getIotliteInterfaceDescription());
                        
                //GEOP POINT
                geoPoint = geoPointRepository.findByiotliteObject(iotliteObject);
                if (geoPoint != null){
                    GeoPointDTO geoPointDTO = new GeoPointDTO();
                    geoPointDTO.setId(geoPoint.getId());
                    geoPointDTO.setIotliteAltRelative(geoPoint.getiotliteAltRelative());
                    geoPointDTO.setIotliteRelativeLocation(geoPoint.getiotliteRelativeLocatione());
                    geoPointDTO.setIotliteRelativeLocation(geoPoint.getiotliteRelativeLocatione());
                    geoPointDTO.setIotlitecoverage(geoPoint.getIotlitecoverage());
                    geoPointDTO.setLongg(geoPoint.getlongg());
                    geoPointDTO.setAlt(geoPoint.getAlt());
                    geoPointDTO.setSsnDeployment(geoPoint.getSsnDeployment());
                    iotLiteObjectDTO.setGeoPoint(geoPointDTO);
                }
      
                
                List<IotLiteAttributeDTO> iotLiteAttributeDTO = new ArrayList<IotLiteAttributeDTO>();
                System.out.println(iotliteAttribute.size());
                for (int i = 0; i < iotliteAttribute.size(); i++) {
                    IotLiteAttributeDTO newAttribute = new IotLiteAttributeDTO();
                    newAttribute.setId(iotliteAttribute.get(i).getId());
                    System.out.println(newAttribute.getId());
                    newAttribute.setDescription(iotliteAttribute.get(i).getDescription());
                    iotLiteAttributeDTO.add(newAttribute);
                }
                System.out.println(iotLiteAttributeDTO.size());
                iotLiteObjectDTO.setIotLiteAttributeDTO(iotLiteAttributeDTO);
    
                deviceDTO.setIotliteObject(iotLiteObjectDTO);
            }

            
            
            //SSN DEVICE, IOT LITE SERVICE, GEOPOINT
            ssnDevice ssnDevice = new ssnDevice();
            iotliteService iotliteService = new iotliteService();
            
            if (iotliteAttribute.size() > 0 && iotliteAttribute.get(0).getSsnDevice()!= null){
                ssnDevice = iotliteAttribute.get(0).getSsnDevice();

                iotliteService = ssnDevice.getIotliteService();
        
                SsnDeviceDTO ssnDeviceDTO = new SsnDeviceDTO();
                IotLiteServiceDTO iotLiteServiceDTO = new IotLiteServiceDTO();


                iotLiteServiceDTO.setId(iotliteService.getId());
                iotLiteServiceDTO.setIotliteInterfaceDescription(iotliteService.getiotliteInterfaceDescription());
                iotLiteServiceDTO.setIotliteendpoint(iotliteService.getiotliteendpoint());
                iotLiteServiceDTO.setIotliteexposedBy(iotliteService.getiotliteexposedBy());
                iotLiteServiceDTO.setIotliteinterfaceType(iotliteService.getiotliteinterfaceType());
        
                ssnDeviceDTO.setId(ssnDevice.getId());
                ssnDeviceDTO.setIotliteActuatingDevice(ssnDevice.getIotliteActuatingDevice());
                
                IotLiteCoverageDTO iotliteCoverageDTO = new IotLiteCoverageDTO();
                iotliteCoverage iotliteCoverage = new iotliteCoverage();
                iotliteCoverage = ssnDevice.getIotliteCoverage();
                iotliteCoverageDTO.setId(iotliteCoverage.getId());
                iotliteCoverageDTO.setIotliteCircle(iotliteCoverage.getIotliteCircle());
                iotliteCoverageDTO.setIotlitePolygon(iotliteCoverage.getiotlitePolygon());
                iotliteCoverageDTO.setIotliteRectangle(iotliteCoverage.getiotliteRectangle());
                    
                ssnDeviceDTO.setIotliteCoverage(iotliteCoverageDTO);
        
        
                ssnDeviceDTO.setIotliteService(iotLiteServiceDTO);
                ssnDeviceDTO.setIotliteTagDevice(ssnDevice.getIotliteTagDevice());

                SsnDeploymentDTO SsnDeploymentDTO = new SsnDeploymentDTO();
                ssnDeployment ssnDeployment = ssnDevice.getSsnDeployment();
                SsnDeploymentDTO.setId(ssnDeployment.getId());
                SsnDeploymentDTO.setDescription(ssnDeployment.getDescription());

                //GEO POINT BY SSnDeployment
                geoPoint geoPointDeployment = new geoPoint();
                System.out.println("ENTRO NEL GEO POINT DEPLOYMENT " + ssnDeployment.getId() + geoPointRepository.findByssnDeployment(ssnDeployment));

                if ( ssnDeployment != null && geoPointRepository.findByssnDeployment(ssnDeployment) != null){
                    System.out.println("ENTRO NEL GEO POINT DEPLOYMENT " + geoPointDeployment.getId());
                    geoPointDeployment = geoPointRepository.findByssnDeployment(ssnDevice.getSsnDeployment());
                    GeoPointDTO geoPointDTO = new GeoPointDTO();
                    

                    geoPointDTO.setId(geoPointDeployment.getId());
                    geoPointDTO.setIotliteAltRelative(geoPointDeployment.getiotliteAltRelative());
                    geoPointDTO.setIotliteRelativeLocation(geoPointDeployment.getiotliteRelativeLocatione());
                    geoPointDTO.setIotliteRelativeLocation(geoPointDeployment.getiotliteRelativeLocatione());
                    geoPointDTO.setIotlitecoverage(geoPointDeployment.getIotlitecoverage());
                    geoPointDTO.setLongg(geoPointDeployment.getlongg());
                    geoPointDTO.setAlt(geoPointDeployment.getAlt());
                    geoPointDTO.setSsnDeployment(geoPointDeployment.getSsnDeployment());
                    SsnDeploymentDTO.setGeoPoint(geoPointDTO);
                }
                //GEO POINT BY IotLiteCoverage
                geoPoint geoPointCoverage = new geoPoint();   
                if (ssnDevice.getIotliteCoverage() != null && geoPointRepository.findByiotlitecoverage(ssnDevice.getIotliteCoverage()) != null){
                    geoPointCoverage = geoPointRepository.findByiotlitecoverage(ssnDevice.getIotliteCoverage());
                    GeoPointDTO geoPointDTO = new GeoPointDTO();
                    System.out.println("ENTRO NEL GEO POINT COVERAGE " + geoPointCoverage.getId());

                    geoPointDTO.setId(geoPointCoverage.getId());
                    geoPointDTO.setIotliteAltRelative(geoPointCoverage.getiotliteAltRelative());
                    geoPointDTO.setIotliteRelativeLocation(geoPointCoverage.getiotliteRelativeLocatione());
                    geoPointDTO.setIotliteRelativeLocation(geoPointCoverage.getiotliteRelativeLocatione());
                    geoPointDTO.setIotlitecoverage(geoPointCoverage.getIotlitecoverage());
                    geoPointDTO.setLongg(geoPointCoverage.getlongg());
                    geoPointDTO.setAlt(geoPointCoverage.getAlt());
                    geoPointDTO.setSsnDeployment(geoPointCoverage.getSsnDeployment());
                    iotliteCoverageDTO.setGeoPoint(geoPointDTO);
                }

                ssnDeviceDTO.setSsnDeployment(SsnDeploymentDTO);
                ssnDeviceDTO.setSsnSensingDevice(ssnDevice.getSsnSensingDevice());

                deviceDTO.setSsnDevice(ssnDeviceDTO);
        
            }
            break;
        case "SYSTEM":
            //SSN SYSTEM
            ssnSystem ssnSystem = ssnSystemRepository.findByOwlThing(owlThing);
            SsnSystemDTO ssnSystemDTO = new SsnSystemDTO();
            if (ssnSystem != null){
                ssnSystemDTO.setId(ssnSystem.getId());
                ssnSystemDTO.setSsnSubSystem(ssnSystem.getssnSubSystem());
    
                //SSN DEVICE, IOT LITE SERVICE, IOT LITE COVERAGE
                ssnDevice ssnDeviceSystem = ssnDeviceRepository.findByssnSystem(ssnSystem);
                SsnDeviceDTO ssnDeviceSystemDTO = new SsnDeviceDTO();
                iotliteCoverage iotliteCoverage = new iotliteCoverage();
                ssnDeployment ssnDeployment = new ssnDeployment();

                IotLiteCoverageDTO iotliteCoverageDTO = new IotLiteCoverageDTO();
                SsnDeploymentDTO ssnDeploymentDTO = new SsnDeploymentDTO();

                if (ssnDeviceSystem != null){
                    ssnDeviceSystemDTO.setId(ssnDeviceSystem.getId());
                    ssnDeviceSystemDTO.setIotliteActuatingDevice(ssnDeviceSystem.getIotliteActuatingDevice());
                    

                    iotliteCoverage = ssnDeviceSystem.getIotliteCoverage();

                    iotliteCoverageDTO.setId(iotliteCoverage.getId());
                    iotliteCoverageDTO.setIotliteCircle(iotliteCoverage.getIotliteCircle());
                    iotliteCoverageDTO.setIotlitePolygon(iotliteCoverage.getiotlitePolygon());
                    iotliteCoverageDTO.setIotliteRectangle(iotliteCoverage.getiotliteRectangle());

                    //GEO POINT BY IotLiteCoverage
                    GeoPointDTO geoPointDTOCoverage = new GeoPointDTO();

                    if (iotliteCoverage != null &&  geoPointRepository.findByiotlitecoverage(iotliteCoverage) != null){
                        geoPoint geoPointSystem = geoPointRepository.findByiotlitecoverage(iotliteCoverage);
                        geoPointDTOCoverage.setId(geoPointSystem.getId());
                        geoPointDTOCoverage.setAlt(geoPointSystem.getAlt());
                        geoPointDTOCoverage.setIotliteAltRelative(geoPointSystem.getiotliteAltRelative());
                        geoPointDTOCoverage.setIotliteRelativeLocation(geoPointSystem.getiotliteRelativeLocatione());
                        geoPointDTOCoverage.setIotlitecoverage(geoPointSystem.getIotlitecoverage());
                        geoPointDTOCoverage.setLongg(geoPointSystem.getlongg());
                        geoPointDTOCoverage.setSsnDeployment(geoPointSystem.getSsnDeployment());
                        // deviceDTO.setGeoPoint(geoPointDTO);
                        iotliteCoverageDTO.setGeoPoint(geoPointDTOCoverage);
                        ssnDeviceSystemDTO.setIotliteCoverage(iotliteCoverageDTO);
                    }
                    
                    ssnDeviceSystemDTO.setIotliteCoverage(iotliteCoverageDTO);

                    ssnDeviceSystemDTO.setIotliteTagDevice(ssnDeviceSystem.getIotliteTagDevice());


                    ssnDeployment = ssnDeviceSystem.getSsnDeployment();
                    ssnDeploymentDTO.setId(ssnDeployment.getId());
                    ssnDeploymentDTO.setDescription(ssnDeployment.getDescription());

                    //GEO POINT BY SsnDeployment
                    GeoPointDTO geoPointDTO = new GeoPointDTO();
                    System.out.println("ENTRO NEL GEO POINT DEPLOYMENT " + ssnDeployment.getId() + geoPointRepository.findByssnDeployment(ssnDeployment));

                    if (ssnDeployment != null && geoPointRepository.findByssnDeployment(ssnDeployment) != null){
                        geoPoint geoPointSystem = geoPointRepository.findByssnDeployment(ssnDeployment);
                        geoPointDTO.setId(geoPointSystem.getId());
                        geoPointDTO.setAlt(geoPointSystem.getAlt());
                        geoPointDTO.setIotliteAltRelative(geoPointSystem.getiotliteAltRelative());
                        geoPointDTO.setIotliteRelativeLocation(geoPointSystem.getiotliteRelativeLocatione());
                        geoPointDTO.setIotlitecoverage(geoPointSystem.getIotlitecoverage());
                        geoPointDTO.setLongg(geoPointSystem.getlongg());
                        geoPointDTO.setSsnDeployment(geoPointSystem.getSsnDeployment());
                        ssnDeploymentDTO.setGeoPoint(geoPointDTO);
                        // deviceDTO.setGeoPoint(geoPointDTO);
                                            
                       
                    }

                    ssnDeviceSystemDTO.setSsnDeployment(ssnDeploymentDTO);

                    ssnDeploymentDTO.setId(ssnDeployment.getId());
                    ssnDeviceSystemDTO.setSsnSensingDevice(ssnDeviceSystem.getSsnSensingDevice());
                    
                    IotLiteServiceDTO iotLiteServiceDTO = new IotLiteServiceDTO();
                    iotliteService iotliteServiceSystem = new iotliteService();
                    iotliteServiceSystem = ssnDeviceSystem.getIotliteService();
                    if (iotliteServiceSystem != null){
                        iotLiteServiceDTO.setId(iotliteServiceSystem.getId());
                        iotLiteServiceDTO.setIotliteInterfaceDescription(iotliteServiceSystem.getiotliteInterfaceDescription());
                        iotLiteServiceDTO.setIotliteendpoint(iotliteServiceSystem.getiotliteendpoint());
                        iotLiteServiceDTO.setIotliteexposedBy(iotliteServiceSystem.getiotliteexposedBy());
                        iotLiteServiceDTO.setIotliteinterfaceType(iotliteServiceSystem.getiotliteinterfaceType());
                        ssnDeviceSystemDTO.setIotliteService(iotLiteServiceDTO);
    
                    }

                }
    
                deviceDTO.setSsnDevice(ssnDeviceSystemDTO);
                deviceDTO.setSsnSystem(ssnSystemDTO);
            }
            
            break;
        case "SERVICE":
            iotliteService iotliteServiceService = iotliteServiceRepository.findByOwlThing(owlThing);
            if (iotliteServiceService != null){
                IotLiteServiceDTO iotLiteServiceDTO = new IotLiteServiceDTO();
                iotLiteServiceDTO.setId(iotliteServiceService.getId());
                iotLiteServiceDTO.setIotliteInterfaceDescription(iotliteServiceService.getiotliteInterfaceDescription());
                iotLiteServiceDTO.setIotliteendpoint(iotliteServiceService.getiotliteendpoint());
                iotLiteServiceDTO.setIotliteexposedBy(iotliteServiceService.getiotliteexposedBy());
                iotLiteServiceDTO.setIotliteinterfaceType(iotliteServiceService.getiotliteinterfaceType());
                deviceDTO.setIotLiteService(iotLiteServiceDTO);
            }
            break;
        default:
            break;
        }

  
        return deviceDTO;

    }



    @GetMapping("/devices")
    List<OwlThing> getDevice(@RequestParam Long id) {
        DAOUser user = new DAOUser();
        user.setId(id);
        return owlThingRepository.findAllOwlThingByDAOUser(user);
    }

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    @PostMapping("/saveDevice")  
    ApiResponseDTO adddevice(@RequestBody DeviceDTO deviceDTO) {
        ApiResponseDTO apiResponseDTO = new ApiResponseDTO();
        apiResponseDTO.setMessage("NEW DEVICE SUCCESFULLY SAVED!");

        OwlThing owlThing = new OwlThing();

        //SET OWL THING + SUB CLASS TYPE + USER
        owlThing.setName(deviceDTO.getOwlThing().getName());


        DAOUser user = userDaoRepository.findById(deviceDTO.getDAOUser().getId()).orElse(new DAOUser());
        SubClassType subClassType = subClassTypeRepository.findById(deviceDTO.getSubClassType().getId()).orElse(new SubClassType());

        owlThing.setDAOUser(user);
        owlThing.setSubClassType(subClassType);

        

        owlThingRepository.save(owlThing);
        if (deviceDTO.getSubClassType() == null){
            apiResponseDTO.setMessage("ERROR NO SUB CLASS TYPE!");
            return apiResponseDTO;
        }
        switch (subClassType.getName().toUpperCase()){
        case "OBJECT":
            //SET IOT LITE OBJECT + IOT LITE ATTRIBUTE + GEO POINT
            IotLiteObjectDTO iotliteObjectDTO = new IotLiteObjectDTO();
            GeoPointDTO geoPointDTO = new GeoPointDTO();

            iotliteObjectDTO = deviceDTO.getIotliteObject();
            geoPointDTO = iotliteObjectDTO.getGeoPoint();
            ssnDevice ssnDeviceForAttribute = new ssnDevice();

            if (iotliteObjectDTO != null){
                iotliteObject iotliteObject = new iotliteObject();
                iotliteObject.setOwlThing(owlThing);
                iotliteObject.setIotliteInterfaceDescription(iotliteObjectDTO.getIotliteInterfaceDescription());

                if (geoPointDTO != null){
                    geoPoint geoPoint = new geoPoint();
                    geoPoint.setAlt(geoPointDTO.getAlt());
                    geoPoint.setIotliteObject(iotliteObject);
                    geoPoint.setIotlitecoverage(geoPointDTO.getIotlitecoverage());
                    geoPoint.setSsnDeployment(geoPointDTO.getSsnDeployment());
                    geoPoint.setalt(geoPointDTO.getAlt());
                    geoPoint.setiotliteAltRelative(geoPointDTO.getIotliteAltRelative());
                    geoPoint.setiotliteRelativeLocation(geoPointDTO.getIotliteRelativeLocation());
                    geoPointRepository.save(geoPoint);
                }
                

                //SAVE IOT LITE OBJECT
                iotliteObjectRepository.save(iotliteObject);

                List<IotLiteAttributeDTO> iotliteAttributeDTO = new ArrayList<IotLiteAttributeDTO>();
                iotliteAttributeDTO = iotliteObjectDTO.getIotLiteAttributeDTO();
                if (iotliteAttributeDTO != null){
                    List<iotliteAttribute> iotliteAttribute = new ArrayList<iotliteAttribute>();
                    for (int i = 0; i < iotliteAttributeDTO.size(); i++) {
                        System.out.println("Count Attribute" + i);
                        iotliteAttribute newAttribute = new iotliteAttribute();
                        newAttribute.setIotliteObject(iotliteObject);
                        newAttribute.setDescription(iotliteAttributeDTO.get(i).getDescription());
                        iotliteAttribute.add(newAttribute);
                    }
                    //SET SSN DEVICE
                    if (deviceDTO.getSsnDevice() != null){
                        SsnDeviceDTO SsnDeviceDTO = deviceDTO.getSsnDevice();
                        ssnDevice ssnDevice = new ssnDevice();
                        ssnDevice.setIotliteActuatingDevice(SsnDeviceDTO.getIotliteActuatingDevice());
                        ssnDevice.setIotliteTagDevice(SsnDeviceDTO.getIotliteTagDevice());
 

                        //SET IotLiteCoverage
                        if (SsnDeviceDTO.getIotliteCoverage() != null){
                            IotLiteCoverageDTO IotLiteCoverageDTO = SsnDeviceDTO.getIotliteCoverage();
                            iotliteCoverage iotliteCoverage = new iotliteCoverage();
                            //SAVE IOT LITE CIRCLE
                            if (IotLiteCoverageDTO.getIotliteCircle() != null){
                                iotliteCircle iotliteCircle = IotLiteCoverageDTO.getIotliteCircle();
                                iotliteCoverage.setIotliteCircle(iotliteCircle);
                                iotliteCircleRepository.save(iotliteCircle);
                            }
                            iotliteCoverage.setiotlitePolygon(IotLiteCoverageDTO.getIotlitePolygon());
                            iotliteCoverage.setiotliteRectangle(IotLiteCoverageDTO.getIotliteRectangle());
                            
                            //SAVE GEO POINT FROM COVERAGE
                            if (IotLiteCoverageDTO.getGeoPoint() != null){
                                GeoPointDTO geoPointDTOCoverage = IotLiteCoverageDTO.getGeoPoint();
                                geoPoint geoPoint = new geoPoint();
                                geoPoint.setAlt(geoPointDTOCoverage.getAlt());
                                // geoPoint.setIotliteObject(iotliteObject);
                                geoPoint.setIotlitecoverage(geoPointDTOCoverage.getIotlitecoverage());
                                geoPoint.setSsnDeployment(geoPointDTOCoverage.getSsnDeployment());
                                geoPoint.setalt(geoPointDTOCoverage.getAlt());
                                geoPoint.setiotliteAltRelative(geoPointDTOCoverage.getIotliteAltRelative());
                                geoPoint.setiotliteRelativeLocation(geoPointDTOCoverage.getIotliteRelativeLocation());
                                geoPointRepository.save(geoPoint);
                            }
                            //SAVE IOT LITE COVERAGE
                            ssnDevice.setIotliteCoverage(iotliteCoverage);
                            iotliteCoverageRepository.save(iotliteCoverage);
                        }
                        //SAVE SSN SENSING DEVICE
                        if (SsnDeviceDTO.getSsnSensingDevice() != null){
                            ssnSensingDevice ssnSensingDevice = SsnDeviceDTO.getSsnSensingDevice();

                            ssnDevice.setSsnSensingDevice(ssnSensingDevice);
                            ssnSensingDeviceRepository.save(ssnSensingDevice);
                        }

                        //SAVE SSN DEPLOYMENT
                        if (SsnDeviceDTO.getSsnDeployment() != null){
                            SsnDeploymentDTO ssnDeploymentDTO = SsnDeviceDTO.getSsnDeployment();
                            ssnDeployment ssnDeployment = new ssnDeployment();
                            ssnDeployment.setDescription(ssnDeploymentDTO.getDescription());

                            if (ssnDeploymentDTO.getGeoPoint() != null){
                                GeoPointDTO geoPointDTOdeployment = ssnDeploymentDTO.getGeoPoint();
                                geoPoint geoPoint = new geoPoint();
                                geoPoint.setAlt(geoPointDTOdeployment.getAlt());
                                // geoPoint.setIotliteObject(iotliteObject);
                                geoPoint.setIotlitecoverage(geoPointDTOdeployment.getIotlitecoverage());
                                geoPoint.setSsnDeployment(geoPointDTOdeployment.getSsnDeployment());
                                geoPoint.setalt(geoPointDTOdeployment.getAlt());
                                geoPoint.setiotliteAltRelative(geoPointDTOdeployment.getIotliteAltRelative());
                                geoPoint.setiotliteRelativeLocation(geoPointDTOdeployment.getIotliteRelativeLocation());
                                geoPointRepository.save(geoPoint);
                            }
                            ssnDevice.setSsnDeployment(ssnDeployment);
                            ssnDeploymentRepository.save(ssnDeployment);
                        }

                        //SAVE IOT LITE SERVICE
                        if (SsnDeviceDTO.getIotliteService() != null){
                            IotLiteServiceDTO IotLiteServiceDTO = SsnDeviceDTO.getIotliteService();
                            iotliteService iotliteService = new iotliteService();

                            iotliteService.setOwlThing(owlThing);
                            iotliteService.setiotliteInterfaceDescription(IotLiteServiceDTO.getIotliteInterfaceDescription());
                            iotliteService.setiotliteendpoint(IotLiteServiceDTO.getIotliteendpoint());
                            iotliteService.setiotliteexposedBy(IotLiteServiceDTO.getIotliteexposedBy());
                            iotliteService.setiotliteinterfaceType(IotLiteServiceDTO.getIotliteinterfaceType());

                            ssnDevice.setIotliteService(iotliteService);
                            iotliteServiceRepository.save(iotliteService);
                        }
                        ssnDeviceForAttribute = ssnDevice;
                        ssnDeviceRepository.save(ssnDevice);

                    }

                    for (int i = 0; i < iotliteAttribute.size(); i++) {
                        iotliteAttribute.get(i).setSsnDevice(ssnDeviceForAttribute);
                    }

                    //SAVE IOT LITE ATTRIBUTE
                    iotliteAttributeRepository.saveAll(iotliteAttribute);
                }
            }
            break;
        case "SYSTEM":
            SsnSystemDTO SsnSystemDTO = deviceDTO.getSsnSystem();
            if (SsnSystemDTO != null){
                ssnSystem ssnSystem = new ssnSystem();
                ssnSystem.setOwlThing(owlThing);
                ssnSystem.setssnSubSystem(SsnSystemDTO.getSsnSubSystem());

                if (deviceDTO.getSsnDevice() != null){
                    SsnDeviceDTO SsnDeviceDTO = deviceDTO.getSsnDevice();
                    ssnDevice ssnDevice = new ssnDevice();
                    ssnDevice.setIotliteActuatingDevice(SsnDeviceDTO.getIotliteActuatingDevice());
                    ssnDevice.setIotliteTagDevice(SsnDeviceDTO.getIotliteTagDevice());
                    ssnDevice.setSsnSystem(ssnSystem);

                    //SET IotLiteCoverage
                    if (SsnDeviceDTO.getIotliteCoverage() != null){
                        IotLiteCoverageDTO IotLiteCoverageDTO = SsnDeviceDTO.getIotliteCoverage();
                        iotliteCoverage iotliteCoverage = new iotliteCoverage();
                        //SAVE IOT LITE CIRCLE
                        if (IotLiteCoverageDTO.getIotliteCircle() != null){
                            iotliteCircle iotliteCircle = IotLiteCoverageDTO.getIotliteCircle();
                            iotliteCoverage.setIotliteCircle(iotliteCircle);
                            iotliteCircleRepository.save(iotliteCircle);
                        }
                        iotliteCoverage.setiotlitePolygon(IotLiteCoverageDTO.getIotlitePolygon());
                        iotliteCoverage.setiotliteRectangle(IotLiteCoverageDTO.getIotliteRectangle());
                                
                        //SAVE GEO POINT FROM COVERAGE
                        if (IotLiteCoverageDTO.getGeoPoint() != null){
                            GeoPointDTO geoPointDTOCoverage = IotLiteCoverageDTO.getGeoPoint();
                            geoPoint geoPoint = new geoPoint();
                            geoPoint.setAlt(geoPointDTOCoverage.getAlt());
                            geoPoint.setIotlitecoverage(geoPointDTOCoverage.getIotlitecoverage());
                            geoPoint.setSsnDeployment(geoPointDTOCoverage.getSsnDeployment());
                            geoPoint.setalt(geoPointDTOCoverage.getAlt());
                            geoPoint.setiotliteAltRelative(geoPointDTOCoverage.getIotliteAltRelative());
                            geoPoint.setiotliteRelativeLocation(geoPointDTOCoverage.getIotliteRelativeLocation());
                            geoPointRepository.save(geoPoint);
                        }
                        //SAVE IOT LITE COVERAGE
                        ssnDevice.setIotliteCoverage(iotliteCoverage);
                        iotliteCoverageRepository.save(iotliteCoverage);
                    }
                    //SAVE SSN SENSING DEVICE
                    if (SsnDeviceDTO.getSsnSensingDevice() != null){
                        ssnSensingDevice ssnSensingDevice = SsnDeviceDTO.getSsnSensingDevice();

                        ssnDevice.setSsnSensingDevice(ssnSensingDevice);
                        ssnSensingDeviceRepository.save(ssnSensingDevice);
                    }

                    //SAVE SSN DEPLOYMENT
                    if (SsnDeviceDTO.getSsnDeployment() != null){
                        SsnDeploymentDTO ssnDeploymentDTO = SsnDeviceDTO.getSsnDeployment();
                        ssnDeployment ssnDeployment = new ssnDeployment();
                        ssnDeployment.setDescription(ssnDeploymentDTO.getDescription());

                        if (ssnDeploymentDTO.getGeoPoint() != null){
                            GeoPointDTO geoPointDTOdeployment = ssnDeploymentDTO.getGeoPoint();
                            geoPoint geoPoint = new geoPoint();
                            geoPoint.setAlt(geoPointDTOdeployment.getAlt());
                            geoPoint.setIotlitecoverage(geoPointDTOdeployment.getIotlitecoverage());
                            geoPoint.setSsnDeployment(geoPointDTOdeployment.getSsnDeployment());
                            geoPoint.setalt(geoPointDTOdeployment.getAlt());
                            geoPoint.setiotliteAltRelative(geoPointDTOdeployment.getIotliteAltRelative());
                            geoPoint.setiotliteRelativeLocation(geoPointDTOdeployment.getIotliteRelativeLocation());
                            geoPointRepository.save(geoPoint);
                        }
                        ssnDevice.setSsnDeployment(ssnDeployment);
                        ssnDeploymentRepository.save(ssnDeployment);
                    }
                    ssnDeviceRepository.save(ssnDevice);
                }
            }
            break;
        case "SERVICE":
            IotLiteServiceDTO IotLiteServiceDTO = deviceDTO.getIotLiteService();
            if (IotLiteServiceDTO != null){
                iotliteService iotliteService = new iotliteService();
                iotliteService.setOwlThing(owlThing);
                iotliteService.setiotliteInterfaceDescription(IotLiteServiceDTO.getIotliteInterfaceDescription());
                iotliteService.setiotliteendpoint(IotLiteServiceDTO.getIotliteendpoint());
                iotliteService.setiotliteexposedBy(IotLiteServiceDTO.getIotliteexposedBy());
                iotliteService.setiotliteinterfaceType(IotLiteServiceDTO.getIotliteinterfaceType());
                iotliteServiceRepository.save(iotliteService);
            }
            break;
        default:
            break;
        }
        
        return apiResponseDTO;
    }
    

    //ESEMPIO URL PARAMETER

    // @GetMapping("/devices/userId/{id}")
    // List<OwlThing> getDevice(@PathVariable(value="id") Long id) {
    //     DAOUser user = new DAOUser();
    //     user.setId(id);
    //     return owlThingRepository.findAllOwlThingByDAOUser(user);
    // }

}
