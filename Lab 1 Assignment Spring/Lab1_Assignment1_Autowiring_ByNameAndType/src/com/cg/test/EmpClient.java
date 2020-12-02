package com.cg.test;

import org.springframework.beans.factory.BeanFactory;
import java.util.Scanner;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.cg.domain.Employee;
import com.cg.domain.SBU;

public class EmpClient {

	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		SBU sbu = (SBU)beanFactory.getBean("sbu");
		System.out.print("Enter the employee id to search it's details: ");
		int employeeIdToSearch = (new Scanner(System.in)).nextInt();
		for(Employee emp:sbu.getEmpList()) {
			if(emp.getEmployeeId()==employeeIdToSearch) {
				System.out.println("\nEmployee Info:");
				System.out.println("Employee ID     :"+emp.getEmployeeId());
				System.out.println("Employee NAME   :"+emp.getEmployeeName());
				System.out.println("Employee SALARY :"+emp.getSalary());
			}
		}
	}

}
