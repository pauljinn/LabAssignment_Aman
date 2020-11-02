package com.capgemini.pizzaapp.util;

import java.util.List;
import java.util.Scanner;

import com.capgemini.pizzaapp.model.Pizza;
import com.capgemini.pizzaapp.service.IPizzaService;
import com.capgemini.pizzaapp.serviceimpl.PizzaService;

public class MenuUtil {
	
	private IPizzaService pizzaService;
	
	public MenuUtil() {
		pizzaService =  new PizzaService();
	}
	
	private void showMenu() {
		
		System.out.println("----------Pizza Menu--------------");
		System.out.println("1. Order Pizza");
		System.out.println("2. List all Pizza");
		System.out.println("3. Customize Pizza");
		System.out.println("4. Cancel order by pizza detail");
		System.out.println("5. Delete order by pizza id");
		System.out.println("Enter your choice");

	}
	
	public Pizza getPizzaDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pizza Name : ");
		String name = sc.next();
		System.out.println("Enter Pizza Size : ");
		String size = sc.next();
		System.out.println("Enter Pizza Crust : ");
		String crust = sc.next();
		return new Pizza(name, crust, size);
		
	}
	public void startApp() {
		Scanner sc=new Scanner(System.in);
		String continueStr;
		
		do {
			menuOperations(sc);
			System.out.println("Do you want to continue : [Y | N]");
			continueStr=sc.next();
		}while(continueStr.equalsIgnoreCase("y"));
	}

	private void menuOperations(Scanner sc) {
		
		showMenu();
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Pizza pizza = getPizzaDetails();
			pizzaService.orderPizza(pizza);
			break;
		case 2:
			List<Pizza> pizzaList =  pizzaService.getAllPizza();
			System.out.println("----------------Pizza Detail----------------------");
			for (Pizza pizzas : pizzaList) {
				System.out.println(pizzas);
			}
			break;
		
		case 3:
			Pizza pizzaToUpdate = getPizzaDetails();
			pizzaService.customizePizza(pizzaToUpdate);
			break;
		
		case 4:
			Pizza pizzaToCancel = getPizzaDetails();
			if(pizzaService.cancelOrder(pizzaToCancel)) {
				System.out.println("Successfully cancelled");
			}
			else {
				System.out.println("Pizza not found.");
			}
			break;
		case 5:
			System.out.print("Enter the id of the pizza to delete:");
			long pizzaId = sc.nextLong();
			if(pizzaService.cancelOrder(pizzaId)) {
				System.out.println("Successfully cancelled");
			}
			else {
				System.out.println("Pizza not found.");
			}
		default:
			System.out.println(" Wrong Choice");
			break;
		}
	}

}