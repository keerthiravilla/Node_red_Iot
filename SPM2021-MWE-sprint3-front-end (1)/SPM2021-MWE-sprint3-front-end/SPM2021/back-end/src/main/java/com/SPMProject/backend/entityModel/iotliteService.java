
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "iotliteService")
public class iotliteService {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String iotliteInterfaceDescription;

  @Column
  private String iotliteendpoint;

  @Column
  private String iotliteexposedBy;

  @Column
  private String iotliteinterfaceType;

  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OwlThing", referencedColumnName = "id")
  private OwlThing owlThing;
	// role based
  // @Column
  // private Long owlThing;

  // public Long getOwlThing() {
  //   return this.owlThing;
  // }

  // public void setOwlThing(Long owlThing) {
  //   this.owlThing = owlThing;
  // }



  public OwlThing getOwlThing() {
    return owlThing;
  }

  public void setOwlThing(OwlThing owlThing) {
    this.owlThing = owlThing;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getiotliteInterfaceDescription() {
    return iotliteInterfaceDescription;
  }

  public void setiotliteInterfaceDescription(String iotliteInterfaceDescription) {
    this.iotliteInterfaceDescription = iotliteInterfaceDescription;
  }

  public String getiotliteendpoint() {
    return iotliteendpoint;
  }

  public void setiotliteendpoint(String iotliteendpoint) {
    this.iotliteendpoint = iotliteendpoint;
  }

  public String getiotliteexposedBy() {
    return iotliteexposedBy;
  }

  public void setiotliteexposedBy(String iotliteexposedBy) {
    this.iotliteexposedBy = iotliteexposedBy;
  }

  public String getiotliteinterfaceType() {
    return iotliteinterfaceType;
  }

  public void setiotliteinterfaceType(String iotliteinterfaceType) {
    this.iotliteinterfaceType = iotliteinterfaceType;
  }
  

}
