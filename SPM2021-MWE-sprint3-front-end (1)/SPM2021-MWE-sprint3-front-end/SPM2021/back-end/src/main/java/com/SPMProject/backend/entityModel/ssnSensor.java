package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "ssnSensor")
public class ssnSensor {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String quQuantityKind;

  @Column
  private String quUnit;



  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ssnDeployment", referencedColumnName = "id")
  private ssnDeployment ssnDeployment;

  

  @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "iotliteMetadata", referencedColumnName = "id")
	private iotliteMetadata iotliteMetadata;

  public iotliteMetadata getIotliteMetadata() {
    return this.iotliteMetadata;
  }

  public void setIotliteMetadata(iotliteMetadata iotliteMetadata) {
    this.iotliteMetadata = iotliteMetadata;
  }

/*
  	// role based
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	// role based
	@JoinTable(name = "USER_ROLES", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID") })

	// role based
	private Set<Role> roles;
*/

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getquQuantityKind() {
    return quQuantityKind;
  }

  public void setquQuantityKind(String quQuantityKind) {
    this.quQuantityKind = quQuantityKind;
  }

  public String getquUnit() {
    return quUnit;
  }

  public void setquUnit(String quUnit) {
    this.quUnit = quUnit;
  }

 
  
  public ssnDeployment getssnDeployment() {
    return ssnDeployment;
  }

  public void setssnDeployment(ssnDeployment ssnDeployment) {
    this.ssnDeployment = ssnDeployment;
  }

}
