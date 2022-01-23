
package com.SPMProject.backend.entityModel;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "OwlThing")
public class OwlThing {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String name;


  @ManyToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "DAOUser", referencedColumnName = "id")
  private DAOUser DAOUser;


  public DAOUser getDAOUser() {
    return DAOUser;
  }

  public void setDAOUser(DAOUser DAOUser) {
    this.DAOUser = DAOUser;
  }

  @ManyToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "SubClassType", referencedColumnName = "id")
  private SubClassType subClassType;

  public SubClassType getSubClassType() {
    return subClassType;
  }

  public void setSubClassType(SubClassType SubClassType) {
    this.subClassType = SubClassType;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
