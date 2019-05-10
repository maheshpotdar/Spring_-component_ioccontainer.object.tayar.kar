package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
	@Qualifier(value = "c1")
	private Car car;

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "Employee [car=" + car + "]";
	}

}
