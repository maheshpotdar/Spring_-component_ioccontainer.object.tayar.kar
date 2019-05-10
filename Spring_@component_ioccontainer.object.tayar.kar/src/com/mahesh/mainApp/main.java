package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;

public class main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.getBean("c1");// car madhe setter injection zal.
		Employee employee = (Employee) context.getBean(Employee.class);
		System.out.println(employee);
		
	}

}
