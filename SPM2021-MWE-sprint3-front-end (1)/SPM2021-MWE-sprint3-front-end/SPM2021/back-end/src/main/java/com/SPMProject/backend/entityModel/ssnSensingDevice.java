
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "ssnSensingDevice")
public class ssnSensingDevice {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;



  
  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ssnSensor", referencedColumnName = "id")
	private ssnSensor ssnSensor;

  

  public ssnSensor getSsnSensor() {
    return ssnSensor;
  }

  public void setSsnSensor(ssnSensor ssnSensor) {
    this.ssnSensor = ssnSensor;
  }



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }



  

}