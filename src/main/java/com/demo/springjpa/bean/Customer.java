package com.demo.springjpa.bean;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;

	@Column
	private String name;

	@Embedded
	private Address address;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "flatNo", column = @Column(name = "OFC_FLAT_NO")),
			@AttributeOverride(name = "streetName", column = @Column(name = "OFC_STREET")) })
	private Address ofcAddress;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getOfcAddress() {
		return ofcAddress;
	}

	public void setOfcAddress(Address ofcAddress) {
		this.ofcAddress = ofcAddress;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + "]";
	}

}
