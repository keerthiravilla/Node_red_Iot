package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "ssnDevice")
public class ssnDevice {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String iotliteActuatingDevice;

 

  @Column
  private String iotliteTagDevice;

  

  

  
  
  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ssnSystem", referencedColumnName = "id")
	private ssnSystem ssnSystem;

  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "iotlitecoverage", referencedColumnName = "id")
	private iotliteCoverage iotliteCoverage;

  
  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "iotliteService", referencedColumnName = "id")
	private iotliteService iotliteService;

  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ssnDeployment", referencedColumnName = "id")
	private ssnDeployment ssnDeployment;

  
  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ssnSensingDevice", referencedColumnName = "id")
	private ssnSensingDevice ssnSensingDevice;


  public long getId() {
    return id;
  }


  public void setId(long id) {
    this.id = id;
  }


  public String getIotliteActuatingDevice() {
    return iotliteActuatingDevice;
  }


  public void setIotliteActuatingDevice(String iotliteActuatingDevice) {
    this.iotliteActuatingDevice = iotliteActuatingDevice;
  }


  public String getIotliteTagDevice() {
    return iotliteTagDevice;
  }


  public void setIotliteTagDevice(String iotliteTagDevice) {
    this.iotliteTagDevice = iotliteTagDevice;
  }


  public ssnSystem getSsnSystem() {
    return ssnSystem;
  }


  public void setSsnSystem(ssnSystem ssnSystem) {
    this.ssnSystem = ssnSystem;
  }


  public iotliteCoverage getIotliteCoverage() {
    return iotliteCoverage;
  }


  public void setIotliteCoverage(iotliteCoverage iotliteCoverage) {
    this.iotliteCoverage = iotliteCoverage;
  }


  public iotliteService getIotliteService() {
    return iotliteService;
  }


  public void setIotliteService(iotliteService iotliteService) {
    this.iotliteService = iotliteService;
  }


  public ssnDeployment getSsnDeployment() {
    return ssnDeployment;
  }


  public void setSsnDeployment(ssnDeployment ssnDeployment) {
    this.ssnDeployment = ssnDeployment;
  }


  public ssnSensingDevice getSsnSensingDevice() {
    return ssnSensingDevice;
  }


  public void setSsnSensingDevice(ssnSensingDevice ssnSensingDevice) {
    this.ssnSensingDevice = ssnSensingDevice;
  }


  
}

