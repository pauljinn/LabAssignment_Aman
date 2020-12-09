package com.cg.manytoone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String title;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
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
