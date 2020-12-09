package com.cg.onetoone.model;

import javax.persistence.*;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToOne
	private Project project;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	
	

}
