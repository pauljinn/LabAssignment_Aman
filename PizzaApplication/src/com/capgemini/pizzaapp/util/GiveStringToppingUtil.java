package com.capgemini.pizzaapp.util;

public class GiveStringToppingUtil {
	public static String stringTopping(int toppingChoice) {
		if(toppingChoice==1) {
			return "Extra Cheese";
		}
		else if(toppingChoice==2) {
			return "Extra Veggies";
		}
		else if(toppingChoice==3) {
			return "Extra Sausage";
		}
		else {
			return null;
		}
	}

}
