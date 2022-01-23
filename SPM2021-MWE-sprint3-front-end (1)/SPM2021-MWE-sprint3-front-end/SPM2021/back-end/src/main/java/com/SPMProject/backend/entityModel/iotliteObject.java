
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "iotliteObject")
public class iotliteObject implements Serializable{
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;



  @Column
  private String iotliteInterfaceDescription;
  






  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OwlThing", referencedColumnName = "id")
  private OwlThing owlThing;

  public OwlThing getOwlThing() {
    return this.owlThing;
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





	public String getIotliteInterfaceDescription() {
    return iotliteInterfaceDescription;
  }

  public void setIotliteInterfaceDescription(String iotliteInterfaceDescription) {
    this.iotliteInterfaceDescription = iotliteInterfaceDescription;
  }
  

}
