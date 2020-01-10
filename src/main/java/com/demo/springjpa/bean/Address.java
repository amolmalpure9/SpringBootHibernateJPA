package com.demo.springjpa.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private Integer flatNo;
	private String streetName;

	public Integer getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(Integer flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
