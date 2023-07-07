
package com.cg.gas.booking.GasBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.gas.booking.GasBooking.model.GasBooking;

public interface GasBookingRepo extends JpaRepository<GasBooking, Integer> {

}
