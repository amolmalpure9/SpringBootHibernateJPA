package com.demo.springjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springjpa.bean.Customer;
import com.demo.springjpa.dao.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("saveCust")
	public void saveCust(@RequestBody Customer customer) {
		System.out.println(customer.getName());
		customerRepository.save(customer);
	}

	@GetMapping("getCust")
	public void displayCust() {
		List<Customer> custList = (List<Customer>) customerRepository.findAll();
		custList.forEach((o) -> {
			System.out.println(o.getName());
		});
	}

	// call as : localhost:8080/deleteCust?id=1
	@DeleteMapping("deleteCust")
	public void deleteCust(@RequestParam("id") int id) {
		Optional<Customer> cust = customerRepository.findById(id);
		Customer customer = cust.get();
		System.out.println("retrived : " + customer.getName());
		customerRepository.delete(customer);
	}

	@PutMapping("updateCust")
	public void updateCust(@RequestBody Customer customer) {
		customerRepository.save(customer);
	}

	// to get the cust by name
	// call as : localhost:8080/getByCustName?name=XYZ
	@GetMapping("getByCustName")
	public List<Customer> getCustByName(@RequestParam("name") String name) {
		System.out.println("------------------------------------------------------------");
		return customerRepository.findAllByName(name);
	}

}
