
package com.cg.gas.booking.GasBooking.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.gas.booking.GasBooking.model.Admin;
import com.cg.gas.booking.GasBooking.model.Bank;
import com.cg.gas.booking.GasBooking.repository.AdminRepo;
import com.cg.gas.booking.GasBooking.serviceInterface.AdminInterface;

@Service
public class AdminImpl implements AdminInterface {

	@Autowired
	AdminRepo adminRepo;

	@Override
	public void insertAdmin(Admin admin) { 
		Admin add = new Admin();
		add.setEmail(admin.getEmail());
		add.setAddress(admin.getAddress());
		add.setPassword(admin.getPassword());
		add.setUserName(admin.getUserName());
		adminRepo.save(add);

	}

	@Override
	public void updateAdmin(Admin admin) { 
		Admin update = adminRepo.findById(admin.getaId()).orElseThrow();
		update.setEmail(admin.getEmail());
		update.setAddress(admin.getAddress());
		update.setPassword(admin.getPassword());
		update.setUserName(admin.getUserName());
		adminRepo.save(update);
	}

	@Override
	public void deleteAdmin(Admin admin) {
		adminRepo.delete(admin);
	}

	@Override
	public void getAllbookings(Admin admin) { 
		// TODO Auto-generated

	}

	@Override
	public void getAllbookingsForDays(Admin admin) { 
		// TODO

	}

}
