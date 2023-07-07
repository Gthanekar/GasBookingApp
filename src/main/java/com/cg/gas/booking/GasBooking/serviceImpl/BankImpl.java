package com.cg.gas.booking.GasBooking.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.gas.booking.GasBooking.model.Bank;
import com.cg.gas.booking.GasBooking.repository.BankRepo;
import com.cg.gas.booking.GasBooking.serviceInterface.BankInterface;

@Service
public class BankImpl implements BankInterface {

	@Autowired
	BankRepo bankRepo;

	@Override
	public void insertBankBank(Bank bank) {
		Bank add = new Bank();
		add.setBankName(bank.getBankName());
		add.setAddress(bank.getAddress());
		bankRepo.save(add);
	}

	@Override
	public void updateBank(Bank bank) {
		Bank update = bankRepo.findById(bank.getBankId()).orElseThrow();
		update.setBankName(bank.getBankName());
		update.setAddress(bank.getAddress());
		bankRepo.save(update);

	}

	@Override
	public void deleteBank(Bank bank) {
		bankRepo.delete(bank);
	}

}