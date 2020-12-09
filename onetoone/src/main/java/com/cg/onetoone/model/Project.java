package com.cg.onetoone.model;

import javax.persistence.*;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String title;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
