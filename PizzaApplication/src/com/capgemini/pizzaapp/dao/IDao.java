package com.capgemini.pizzaapp.dao;

import com.capgemini.pizzaapp.model.Pizza;
import java.util.List;
/**
 * IDao will provides the operation like create, update, delete etc.
 * Stores the pizza related information in local repository.
 * @author Aman Soni
 *
 */
public interface IDao {
	/**
	 * Inert the pizza in the local repository.
	 * @param pizza to insert.
	 * @return true on successful insertion and vice versa on unsuccessful insertion.
	 */
	void savePizza(Pizza pizza);
	
	/**
	 * This list method will return the available pizzas from repository
	 * 
	 * @return pizzas if found otherwise null
	 */
	List<Pizza> list();
	
	/**
	 * Update the pizza provided in local repository.
	 * @param pizza to update.
	 */
	void update(Pizza pizza);
	
	/**
	 * Delete the pizza provided in the local repository if present.
	 * @param pizza to delete.
	 * @return true on successful deletion and false otherwise.
	 */
	boolean delete(Pizza pizza);
	
	/**
	 * Delete the pizza based on it's id in local repository if present.
	 * @param pizzaId of the pizza to delete.
	 * @return true on successful deletion and false otherwise.
	 */
	boolean delete(long pizzaId);

}
