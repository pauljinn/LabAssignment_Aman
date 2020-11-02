package com.capgemini.pizzaapp.util;

public class GiveStringCrustTypeUtil {
	public static String crustType(int choice) {
		if(choice==1) {
			return "New hand tossed";
		}
		else if(choice==2) {
			return "Cheese burst";
		}
		else if(choice==3) {
			return "Classic hand tossed";
		}
		else {
			return null;
		}
	}

}
