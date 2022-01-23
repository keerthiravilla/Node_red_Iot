
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "ssnDeployment")
public class ssnDeployment implements Serializable{
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;


  private String description;

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }






  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  

}