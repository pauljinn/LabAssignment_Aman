package com.cg.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.cg.domain.Employee;

public class EmpClient {

	public static void main(String[] args) {
		Resource res = new FileSystemResource("beanConfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(res);
		Employee employee = (Employee)beanFactory.getBean("employee");
		System.out.println("Employee details");
		System.out.println("-----------------------");
		System.out.println(employee);
	}

}
