
package com.SPMProject.backend.entityModel;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "SubClassType")
public class SubClassType {
    

  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true)
  private long id;
  
  @Column
  private String name;


  @OneToMany(mappedBy = "SubClassType", fetch = FetchType.LAZY,
  cascade = CascadeType.ALL)
  




public long getId() {
    return this.id;
}

public void setId(long id) {
    this.id = id;
}

public String getName() {
    return this.name;
}

public void setName(String name) {
    this.name = name;
}

}