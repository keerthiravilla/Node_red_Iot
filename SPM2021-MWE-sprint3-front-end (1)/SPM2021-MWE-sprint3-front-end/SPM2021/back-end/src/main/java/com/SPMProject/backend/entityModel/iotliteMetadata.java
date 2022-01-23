
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "iotliteMetadata")
public class iotliteMetadata {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String iotliteMetadataType;

  @Column
  private String iotliteMetadataValue;

  




  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getiotliteMetadataType() {
    return iotliteMetadataType;
  }

  public void setiotliteMetadataType(String iotliteMetadataType) {
    this.iotliteMetadataType = iotliteMetadataType;
  }

  public String getiotliteMetadataValue() {
    return iotliteMetadataValue;
  }

  public void setiotliteMetadataValue(String iotliteMetadataValue) {
    this.iotliteMetadataValue = iotliteMetadataValue;
  }

  

}
