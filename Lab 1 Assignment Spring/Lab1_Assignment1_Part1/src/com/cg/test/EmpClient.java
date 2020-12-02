package com.cg.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.cg.domain.Employee;

/**
 * For testing the bean configuration created in beans.xml file.
 * @author Aman Soni
 *
 */
public class EmpClient {

	public static void main(String[] args) {
		/**
		 * Creating a resource of file in which bean definition is given.
		 */
		FileSystemResource resource = new FileSystemResource("beanConfig.xml");
		/**
		 * Creating a bean factory to produce the beans from the resource specified.
		 */
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		/**
		 * Getting the bean of employee from the bean factory.
		 */
		Employee employee = (Employee)beanFactory.getBean("employee");
		/**
		 * Printing the details of the employee configured as bean in beanConfig.xml
		 */
		System.out.println("Employee details");
		System.out.println("-----------------------");
		System.out.println(employee);
	}

}
