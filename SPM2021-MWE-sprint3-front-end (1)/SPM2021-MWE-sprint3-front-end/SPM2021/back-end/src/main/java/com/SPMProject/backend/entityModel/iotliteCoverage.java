
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "iotliteCoverage")
public class iotliteCoverage implements Serializable{
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String iotliteRectangle;

  @Column
  private String iotlitePolygon;


  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "iotliteCircle", referencedColumnName = "id")
	private iotliteCircle iotliteCircle;

  public iotliteCircle getIotliteCircle() {
    return iotliteCircle;
  }

  public void setIotliteCircle(iotliteCircle iotliteCircle) {
    this.iotliteCircle = iotliteCircle;
  }

 

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getiotliteRectangle() {
    return iotliteRectangle;
  }

  public void setiotliteRectangle(String iotliteRectangle) {
    this.iotliteRectangle = iotliteRectangle;
  }

  public String getiotlitePolygon() {
    return iotlitePolygon;
  }

  public void setiotlitePolygon(String iotlitePolygon) {
    this.iotlitePolygon = iotlitePolygon;
  }




  

}
