
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "geoPoint")
public class geoPoint {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String iotliteRelativeLocation;

  @Column
  private String iotliteAltRelative;

  @Column
  private String alt;

  public String getAlt() {
    return this.alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  @Column
  private String longg;

  
  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ssnDeployment", referencedColumnName = "id")
	private ssnDeployment ssnDeployment;

  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "iotliteObject", referencedColumnName = "id")
	private iotliteObject iotliteObject;

  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "iotlitecoverage", referencedColumnName = "id")
	private iotliteCoverage iotlitecoverage;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getiotliteRelativeLocatione() {
    return iotliteRelativeLocation;
  }

  public void setiotliteRelativeLocation(String iotliteRelativeLocation) {
    this.iotliteRelativeLocation = iotliteRelativeLocation;
  }

  public String getiotliteAltRelative() {
    return iotliteAltRelative;
  }

  public void setiotliteAltRelative(String iotliteAltRelative) {
    this.iotliteAltRelative = iotliteAltRelative;
  }

  public String getiotlitealt() {
    return alt;
  }

  public void setalt(String alt) {
    this.alt = alt;
  }

  public String getlongg() {
    return longg;
  }

  public void longg(String longg) {
    this.longg = longg;
  }
  
  public iotliteObject getIotliteObject() {
    return iotliteObject;
  }

  public void setIotliteObject(iotliteObject iotliteObject) {
    this.iotliteObject = iotliteObject;
  }

  public ssnDeployment getSsnDeployment() {
    return ssnDeployment;
  }

  public void setSsnDeployment(ssnDeployment ssnDeployment) {
    this.ssnDeployment = ssnDeployment;
  }

  public iotliteCoverage getIotlitecoverage() {
    return iotlitecoverage;
  }

  public void setIotlitecoverage(iotliteCoverage iotlitecoverage) {
    this.iotlitecoverage = iotlitecoverage;
  }

}
