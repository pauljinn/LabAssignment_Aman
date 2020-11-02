package com.capgemini.pizzaapp.util;

public class GiveStringSizeUtil {
	public static String returnStringSize(int sizeChoice) {
		if(sizeChoice==1) {
			return "Small";
		}
		else if(sizeChoice==2) {
			return "Medium";
		}
		else if(sizeChoice==3) {
			return "Large";
		}
		else {
			return null;
		}
	}
}