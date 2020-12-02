package com.cg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Using annotation based autowiring here.
 * @author Aman Soni
 *
 */
public class EmpClientAnnotationBased {

	public static void main(String[] args) {
		/**
		 * Registering the configuration xml file.
		 */
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
		/**
		 * Getting the bean for employee.
		 */
		System.out.println(ctx.getBean("employee"));

	}

}
