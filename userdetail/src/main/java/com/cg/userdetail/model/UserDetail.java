package com.cg.userdetail.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class UserDetail {
	@Id
	private int id;
	private String name;
	
	@ElementCollection
	@JoinTable(name="addresses",joinColumns= @JoinColumn(name="user_id"))
	private List<Address> address = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
	
	
	
	
	

}
