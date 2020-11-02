package com.capgemini.pizzaapp.service;

import com.capgemini.pizzaapp.model.Pizza;
import java.util.List;

/**
 * This perform all the business logic
 * like: order pizza, cook pizza, display pizza detail, get all pizza and customize pizza.
 * @author Aman Soni
 */
public interface IPizzaService {
	/**
	 * Takes order from customer and pass to DAO layer.
	 * @param pizza
	 */
	void orderPizza(Pizza pizza);
	
	/**
	 * Gets all the pizza's available in the system returns null if not available.
	 * @return the pizza's available if not null.
	 */
	List<Pizza> getAllPizza();
	
	/**
	 * Customize the pizza based on customer response.
	 * @param pizza.
	 */
	void customizePizza(Pizza pizza);
	
	/**
	 * Cancel the order for the pizza.
	 * @param pizza
	 * @return true on successful cancellation and vice versa.
	 */
	boolean cancelOrder(Pizza pizza);
	
	/**
	 * Cancel the order for pizza based on it's id.
	 * @param pizzaId
	 * @return true on successful cancellation and vice versa.
	 */
	boolean cancelOrder(long pizzaId);
	
}
