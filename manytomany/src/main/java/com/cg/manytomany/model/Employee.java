package com.cg.manytomany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.cg.manytomany.model.Project;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany
	@JoinTable(name="projectassignment",joinColumns = @JoinColumn(name="emp_id"),inverseJoinColumns = @JoinColumn(name="proj_id"))
	private List<Project> project = new ArrayList<Project>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	
	
	
}