package com.capgemini.pizzaapp.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.pizzaapp.dao.IDao;
import com.capgemini.pizzaapp.model.Pizza;
import com.capgemini.pizzaapp.util.GiveStringCrustTypeUtil;
import com.capgemini.pizzaapp.util.GiveStringSizeUtil;
import com.capgemini.pizzaapp.util.GiveStringToppingUtil;
import com.capgemini.pizzaapp.util.UpdateMenu;
/**
 * Implements all the functionalities of the data abstraction object.
 * @author Aman Soni
 *
 */
public class Dao implements IDao{
	/**
	 * A local repostiory to store the pizza.
	 */
	private List<Pizza> pizzaLocalRepository;
	
	/**
	 * Initializing the local repository.
	 */
	public Dao() {
		pizzaLocalRepository = new ArrayList<>();
	}

	@Override
	public void savePizza(Pizza pizza) {
		pizzaLocalRepository.add(pizza);
		
	}

	@Override
	public void update(Pizza pizza) {
			int updateChoice ;
			do {
				/**
				 * Showing the update menu to user.
				 */
				UpdateMenu.showUpdateMenu();
				/**
				 * Taking the user choice to update the pizza.
				 */
				Scanner input = new Scanner(System.in);
				updateChoice = input.nextInt();
				/**
				 * Flag for successful update.
				 */
				boolean UPDATE_SUCCESSFULL = false;
				/**
				 * Performing appropriate functionality based on user update choice.
				 */
				switch(updateChoice) {
				/**
				 * For updating crust.
				 */
				case 1:
					do {
						/**
						 * Showing different crust to user.
						 */
						UpdateMenu.showCrustType();
						/**
						 * Taking user choice for updating crust.
						 */
						int crustChoice = input.nextInt();
						String crustType = GiveStringCrustTypeUtil.crustType(crustChoice);
						
						/**
						 * Checking for wrong user choice.
						 */
						if(crustType==null){
							System.out.println("Choose a right crust to update.");
						}
						
						/**
						 * Checking if the old and new crust of the pizza is same.
						 */
						else if(crustType.equals(pizza.getCrust())) {
							System.out.println("Choose a different crust type as the pizza already have this crust.");
						}
						
						/**
						 * Updating the new crust.
						 */
						else {
							pizza.setCrust(crustType);
							UPDATE_SUCCESSFULL = true;
						}
					}while(!UPDATE_SUCCESSFULL);
					UPDATE_SUCCESSFULL = false;
					break;
				/**
				 * For updating toppings.	
				 */
				case 2:
					do {
						/**
						 * Showing the topping menu to user.
						 */
						UpdateMenu.showToppings();
						/**
						 * Getting the user choice for adding extra topping.
						 */
						int toppingChoice = input.nextInt();
						/**
						 * Getting the extra topping on the basis of user choice.
						 */
						String extraTopping = GiveStringToppingUtil.stringTopping(toppingChoice);
						/**
						 * Checking if user select right option.
						 */
						if(extraTopping==null) {
							System.out.println("Choose a right topping");
						}
						/**
						 * Setting the extra topping on pizza.
						 */
						else {
							/**
							 * Getting the default toppings of pizza.
							 */
							String oldTopping = pizza.getToppings();
							/**
							 * Setting the extra topping along with default topping.
							 */
							pizza.setToppings(oldTopping + "+" + extraTopping);
							/**
							 * Setting the update flag to true.
							 */
							UPDATE_SUCCESSFULL = true;
						}
					}while(!UPDATE_SUCCESSFULL);
					/**
					 * After successful update setting update flag again to false.
					 */
					UPDATE_SUCCESSFULL = false;
					break;
				/**
				 * For updating the pizza size.
				 */
				case 3:
					do {
						/**
						 * Showing the menu for various size.
						 */
						UpdateMenu.showSizes();
						/**
						 * Getting the user input for size based on menu.
						 */
						int sizeChoice = input.nextInt();
						/**
						 * Based on choice getting the size of the pizza.
						 */
						String size = GiveStringSizeUtil.returnStringSize(sizeChoice);
						if(size==null) {
							System.out.println("Choose a right size to update");
						}
						else if(pizza.getSize().equals(size)) {
							System.out.println("Choose a different size to update");
						}
						else {
							pizza.setSize(size);
							UPDATE_SUCCESSFULL = true;
						}
						
					}while(!UPDATE_SUCCESSFULL);
					UPDATE_SUCCESSFULL = false;
					break;
				/**
				 * For exit.
				 */
				case 4:
					System.out.println("Exiting...");
					break;
				/**
				 * For wrong input.
				 */
				default:
					System.out.println("Choose a right option to update the pizza.");
				}
			}while(updateChoice !=4);
			pizzaLocalRepository.add(pizza);
			
	}

	@Override
	public boolean delete(Pizza pizza) {
		/**
		 * Checking if the pizza is present in the local repsoitory.
		 */
		if(pizzaLocalRepository.contains(pizza)) {
			/**
			 * If yes removing the pizza.
			 */
			pizzaLocalRepository.remove(pizza);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean delete(long pizzaId) {
		/**
		 * Looping through all the pizza in the local repository.
		 */
		for(Pizza pizza:pizzaLocalRepository) {
			/**
			 * Checking if the id of the pizza is same as id provided.
			 */
			if(pizza.getId() == pizzaId) {
				/**
				 * If yes removing the pizza from the local repository.
				 */
				pizzaLocalRepository.remove(pizza);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Pizza> list() {
		return pizzaLocalRepository;
	}
	
	

}
