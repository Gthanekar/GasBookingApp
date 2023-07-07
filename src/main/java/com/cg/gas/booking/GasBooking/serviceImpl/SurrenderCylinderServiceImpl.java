
package com.cg.gas.booking.GasBooking.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.gas.booking.GasBooking.model.SurrenderCylinder;
import com.cg.gas.booking.GasBooking.repository.SurrenderCylinderRepo;
import com.cg.gas.booking.GasBooking.serviceInterface.SurrenderCylinderInterface;

@Service
public class SurrenderCylinderServiceImpl implements SurrenderCylinderInterface {

	@Autowired
	SurrenderCylinderRepo surrenderCylinderRepo;

	@Override
	public void insertSurrenderCylinder(SurrenderCylinder sc) {
		SurrenderCylinder add = new SurrenderCylinder();
		add.setCylinder(sc.getCylinder());
		add.setCustomer(sc.getCustomer());
		add.setSurrenderDate(sc.getSurrenderDate());
		surrenderCylinderRepo.save(add);
	}

	@Override
	public void updateSurrenderCylinder(SurrenderCylinder sc) {
		SurrenderCylinder update = surrenderCylinderRepo.findById(sc.getSurrenderId()).orElseThrow();
		update.setCylinder(sc.getCylinder());
		update.setCustomer(sc.getCustomer());
		update.setSurrenderDate(sc.getSurrenderDate());
		surrenderCylinderRepo.save(update);
	}

	@Override
	public void deleteSurrenderCylinder(SurrenderCylinder sc) {
		surrenderCylinderRepo.delete(sc);
	}

	@Override
	public void countSurrenderCylinder(SurrenderCylinder sc) {

	}
}