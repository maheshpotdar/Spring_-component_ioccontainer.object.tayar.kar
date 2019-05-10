package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String carname;
	private String carmodelyear;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	@Required
	public void setCarmodelyear(String carmodelyear) {
		this.carmodelyear = carmodelyear;
	}
	@Required
	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String toString() {
		return "[" + "carName: " + carname + " car model year: " + carmodelyear + "]";
	}

}
