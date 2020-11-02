package com.capgemini.pizzaapp.util;

import java.util.Scanner;

public class UpdateMenu {
	/**
	 * Show the menu to user for updating the pizza.
	 */
	public static void showUpdateMenu() {
		System.out.println("Choose an option to update your Pizza.");
		System.out.println("1.Update crust.");
		System.out.println("2.Update toppings.");
		System.out.println("3.Update size.");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
	}
	
	/**
	 * Shows the different crust types to user.
	 */
	public static void showCrustType() {
		System.out.println("1.New hand tossed.");
		System.out.println("2. Cheese burst");
		System.out.println("3. Classic hand tossed.");
		System.out.println("Choose a crust to update: ");
	}
	
	/**
	 * Showing different topping to user.
	 */
	public static void showToppings() {
		System.out.println("1. Extra Cheese");
		System.out.println("2. Extra Veggies");
		System.out.println("3. Extra Sausage ");
		System.out.println("Choose an extra topping to add: ");
	}
	
	public static void showSizes() {
		System.out.println("1. Small");
		System.out.println("2. Medium");
		System.out.println("3. Large");
		System.out.println("Choose a size to update: ");
	}
}
