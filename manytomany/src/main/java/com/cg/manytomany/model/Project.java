package com.cg.manytomany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.cg.manytomany.model.Employee;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String title;
	
	@ManyToMany(mappedBy="projects")
	private Employee employee;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return this.employee;
	}
	
	
}
