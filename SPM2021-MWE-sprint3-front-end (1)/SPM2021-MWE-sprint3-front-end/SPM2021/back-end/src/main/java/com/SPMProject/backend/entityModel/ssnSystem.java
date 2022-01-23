
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "ssnSystem")
public class ssnSystem {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String ssnSubSystem;

  
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "OwlThing", referencedColumnName = "id")
	// role based
	private OwlThing owlThing;


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

  public String getssnSubSystem() {
    return ssnSubSystem;
  }

  public void setssnSubSystem(String ssnSubSystem) {
    this.ssnSubSystem = ssnSubSystem;
  }

  

}