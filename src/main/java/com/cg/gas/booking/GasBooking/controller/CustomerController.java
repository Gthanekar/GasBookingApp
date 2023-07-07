
package com.cg.gas.booking.GasBooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.gas.booking.GasBooking.model.Customer;
import com.cg.gas.booking.GasBooking.serviceImpl.CustomerImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerImpl customerImpl;

	@PostMapping("/insertCustomer")
	public ResponseEntity<Customer> insertCustomer(@RequestBody Customer customer) {
		customerImpl.insertCustomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		customerImpl.updateCustomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@DeleteMapping("/deleteCustomer")
	public ResponseEntity<Customer> deleteCustomer(@RequestBody Customer customer) {
		customerImpl.deleteCusomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return ResponseEntity.ok().body(customerImpl.viewCustomers());
	}

	@GetMapping("/getCustomerById/{id}")
	public ResponseEntity<Optional<Customer>> getUser(@PathVariable("id") int id) {
		return ResponseEntity.ok().body(customerImpl.getCustomerById(id));
	}
}
