package com.cg.testdemo;
import java.util.*;
public class Sample {

	public static void calculate(String string) {
		// TODO Auto-generated method stub
		if(string.length()==1) {
			//return (int) Integer.parseInt(string);
		}
		else {
			
			System.out.println(Arrays.stream(string.split(",")).mapToInt(Integer::parseInt).sum());
		}
	}
	public static void main(String[] args) {
		calculate("1,2");
	}
	
}
