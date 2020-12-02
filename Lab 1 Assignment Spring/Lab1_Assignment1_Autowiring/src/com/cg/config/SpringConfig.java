package com.cg.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.domain.Employee;

@Configuration
@ComponentScan("com.cg")
public class SpringConfig {
	@Bean(name = "empList")
	public ArrayList<Employee> getEmpList(){
		Employee e1 = new Employee(12345,"Harry",30000.0);
		Employee e2 = new Employee(123456,"Harriet",40000.0);
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		//Employee[] empArray = {e1,e2};
		//List<Employee> empList = Arrays.asList(empArray);
		return empList;
	}

}

