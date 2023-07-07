
package com.cg.gas.booking.GasBooking.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.cg.gas.booking.GasBooking.model.Cylinder;

public interface CylinderServiceInterfdace {

	public void insertCylinder(Cylinder cylinder);

	public void updateCylinder(Cylinder cylinder);

	public void deleteCylinder(int cylinderId);

	public Optional<Cylinder> viewCylinderByType(String type);

}
