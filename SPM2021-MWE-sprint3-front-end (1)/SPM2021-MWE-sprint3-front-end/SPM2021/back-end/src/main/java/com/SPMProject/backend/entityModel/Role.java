package com.SPMProject.backend.entityModel;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id", unique = true)
    private long id;

    @Column
    private String name;

    @Column
    private String description;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}