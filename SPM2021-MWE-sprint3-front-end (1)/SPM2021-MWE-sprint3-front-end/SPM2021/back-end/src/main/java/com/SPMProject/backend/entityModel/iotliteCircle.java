
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "iotliteCircle")
public class iotliteCircle {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String iotliteradius;

  
 

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getiotliteradiuse() {
    return iotliteradius;
  }

  public void setiotliteradiuse(String iotliteradius) {
    this.iotliteradius = iotliteradius;
  }

  

}