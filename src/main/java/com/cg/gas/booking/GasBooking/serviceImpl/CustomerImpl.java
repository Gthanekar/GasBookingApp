
package com.cg.gas.booking.GasBooking.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.gas.booking.GasBooking.model.Customer;
import com.cg.gas.booking.GasBooking.model.GasBooking;
import com.cg.gas.booking.GasBooking.repository.CustomerRepo;
import com.cg.gas.booking.GasBooking.serviceInterface.CustomerInterface;

@Service
public class CustomerImpl implements CustomerInterface {

	@Autowired
	CustomerRepo customerRepo;

	@Override
	public void insertCustomer(Customer customer) {
		Customer add = new Customer();
		add.setEmail(customer.getEmail());
		add.setUserName(customer.getUserName());
		add.setPassword(customer.getPassword());
		add.setEmail(customer.getEmail());
		add.setAddress(customer.getAddress());
		add.setCustomerId(customer.getCustomerId());
		add.setAccountNo(customer.getAccountNo());
		add.setBank(customer.getBank());
		add.setCylinder(customer.getCylinder());
		add.setIfscNo(customer.getIfscNo());
		add.setPan(customer.getPan());
		customerRepo.save(add);

	}

	@Override
	public void updateCustomer(Customer customer) {
		Customer update = customerRepo.findById(customer.getCustomerId()).orElseThrow();
		update.setEmail(customer.getEmail());
		update.setUserName(customer.getUserName());
		update.setPassword(customer.getPassword());
		update.setEmail(customer.getEmail());
		update.setAddress(customer.getAddress());
		update.setCustomerId(customer.getCustomerId());
		update.setAccountNo(customer.getAccountNo());
		update.setBank(customer.getBank());
		update.setCylinder(customer.getCylinder());
		update.setIfscNo(customer.getIfscNo());
		update.setPan(customer.getPan());
		customerRepo.save(update);
	}

	@Override
	public void deleteCusomer(Customer customer) {
		customerRepo.delete(customer);
	}

	@Override
	public List<Customer> viewCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public void validateCustomer(String Username, String Password) {

	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return customerRepo.findById(id);
	}

}
