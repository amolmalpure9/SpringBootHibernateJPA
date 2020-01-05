package com.demo.springjpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.springjpa.bean.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	// This is not a default method present in CrudRepostory.SO just create a
	// definition as below and internally it will get the result for you

	public List<Customer> findAllByName(String name);
}
