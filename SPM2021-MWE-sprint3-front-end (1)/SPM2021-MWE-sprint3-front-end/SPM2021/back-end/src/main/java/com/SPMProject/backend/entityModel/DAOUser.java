

package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user")
public class DAOUser {
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;

  @Column
  private String name;

  @Column
  private String surname;

  @Column
  private String email;
  
  @Column
  @JsonIgnore
  private String password;

  private String token;

  public String getToken() {
    return this.token;
  }

  public void setToken(String token) {
    this.token = token;
  }
  
  	// role based
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	// role based
	@JoinTable(name = "USER_ROLES", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID") })

	// role based
	private Set<Role> roles;


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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSurname() {
    return this.surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
  
}
