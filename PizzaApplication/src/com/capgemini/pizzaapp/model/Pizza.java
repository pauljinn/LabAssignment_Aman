package com.capgemini.pizzaapp.model;

/**
 * Models the pizza and used as a information provider related to pizza in different layer.
 * @author Aman Soni
 *
 */
public class Pizza {
	/**
	 * Stores the id of the pizza.
	 */
	private long id;
	
	/**
	 * Stores the name of the pizza.
	 */
	private String name;
	
	/**
	 * Stores the crust type of the pizza.
	 */
	private String crust;
	
	/**
	 * Stores the size of the pizza which can be Small, Medium and Large.
	 */
	private String size;
	
	/**
	 * Stores the toppings on the pizza
	 * It can be updated according to customer preference.
	 */
	private String toppings;
	
	/**
	 * To create a new Pizza with given name, crust and size.
	 * @param name of the pizza.
	 * @param crust of the pizza.
	 * @param size of the pizza.
	 */
	public Pizza(String name, String crust, String size) {
		super();
		this.name = name;
		this.crust = crust;
		this.size = size;
	}
	
	/**
	 * @return the id of the pizza.
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * set the id of the pizza.
	 * @param id of the pizza.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name of the pizza.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name of the pizza.
	 * @param name of the pizza.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return crust of the pizza.
	 */
	public String getCrust() {
		return crust;
	}
	
	/**
	 * Set the crust of the pizza.
	 * @param crust
	 */
	public void setCrust(String crust) {
		this.crust = crust;
	}
	
	/**
	 * @return the size of the pizza.
	 */
	public String getSize() {
		return size;
	}
	
	/**
	 * Set the size of the pizza.
	 * @param size of the pizza.
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 * @return the topping on the pizza.
	 */
	public String getToppings() {
		return toppings;
	}
	
	/**
	 * Set the toppings on the pizza.
	 * @param toppings of the pizza.
	 */
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", crust=" + crust + ", size=" + size + "]";
	}
	
	
	

}
 