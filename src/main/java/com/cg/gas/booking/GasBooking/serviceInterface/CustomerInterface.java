
package com.cg.gas.booking.GasBooking.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.cg.gas.booking.GasBooking.model.Customer;

public interface CustomerInterface {

	public void insertCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public void deleteCusomer(Customer customer);

	public List<Customer> viewCustomers();

	public Optional<Customer> getCustomerById(int id);

	public void validateCustomer(String Username, String Password);

}
