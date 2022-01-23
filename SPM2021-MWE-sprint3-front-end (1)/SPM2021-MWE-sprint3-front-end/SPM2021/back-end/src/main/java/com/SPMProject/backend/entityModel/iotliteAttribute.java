
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "iotliteAttribute")
public class iotliteAttribute {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;


  @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "iotliteObject", referencedColumnName = "id")
  private iotliteObject iotliteObject;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Column
  private String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ssnDevice", referencedColumnName = "id")
	private ssnDevice ssnDevice;

  public iotliteObject getIotliteObject() {
    return iotliteObject;
  }

  public void setIotliteObject(iotliteObject iotliteObject) {
    this.iotliteObject = iotliteObject;
  }

  public ssnDevice getSsnDevice() {
    return ssnDevice;
  }

  public void setSsnDevice(ssnDevice ssnDevice) {
    this.ssnDevice = ssnDevice;
  }
  

}