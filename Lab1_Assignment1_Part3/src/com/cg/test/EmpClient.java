package com.cg.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.cg.domain.SBU;

public class EmpClient {

	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		SBU sbu = (SBU)beanFactory.getBean("sbu");
		System.out.println("SBU details");
		System.out.println("-----------------------");
		System.out.println(sbu);
	}

}
