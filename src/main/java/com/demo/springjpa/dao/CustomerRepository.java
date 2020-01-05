package com.demo.springjpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.springjpa.bean.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
