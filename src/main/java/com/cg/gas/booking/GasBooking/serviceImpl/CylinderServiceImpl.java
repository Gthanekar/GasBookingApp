
package com.cg.gas.booking.GasBooking.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.gas.booking.GasBooking.model.Cylinder;
import com.cg.gas.booking.GasBooking.repository.CylinderServiceRepo;
import com.cg.gas.booking.GasBooking.serviceInterface.CylinderServiceInterfdace;

@Service
public class CylinderServiceImpl implements CylinderServiceInterfdace {

	@Autowired
	CylinderServiceRepo cylinderRepo;

	@Override
	public void insertCylinder(Cylinder cylinder) {
		Cylinder add = new Cylinder();
		add.setPrice(cylinder.getPrice());
		add.setStrapColor(cylinder.getStrapColor());
		add.setType(cylinder.getType());
		add.setWeight(cylinder.getWeight());
		cylinderRepo.save(add);
	}

	@Override
	public void updateCylinder(Cylinder cylinder) {
		Cylinder update = cylinderRepo.findById(cylinder.getCylinderId()).orElseThrow();
		update.setPrice(cylinder.getPrice());
		update.setStrapColor(cylinder.getStrapColor());
		update.setType(cylinder.getType());
		update.setWeight(cylinder.getWeight());
		cylinderRepo.save(update);

	}

	@Override
	public void deleteCylinder(int cylinderId) {
		cylinderRepo.deleteById(cylinderId);
		;
	}

	@Override
	public Optional<Cylinder> viewCylinderByType(String type) {
		return cylinderRepo.findByType(type);
	}

}
