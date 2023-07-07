
package com.cg.gas.booking.GasBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.gas.booking.GasBooking.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

//	public abstract Customer findById(int uid);
}
