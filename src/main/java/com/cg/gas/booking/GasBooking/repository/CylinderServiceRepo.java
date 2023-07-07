
package com.cg.gas.booking.GasBooking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.gas.booking.GasBooking.model.Cylinder;

public interface CylinderServiceRepo extends JpaRepository<Cylinder, Integer> {
	
	public abstract Optional<Cylinder> findByType(String type);
}
