package com.cg.gas.booking.GasBooking.serviceImpl;

import com.cg.gas.booking.GasBooking.model.Bank;
import com.cg.gas.booking.GasBooking.repository.BankRepo;
import com.cg.gas.booking.GasBooking.serviceInterface.BankInterface;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class BankImpl implements BankInterface {

    @Autowired
    BankRepo bankRepo;
    @Override
    public void insertBankBank(Bank bank) {
        Bank add = new Bank();
        add.setBank_name(bank.getBank_name());
        add.setAddress(bank.getAddress());
        bankRepo.save(add);
    }

    @Override
    public void updateBank(Bank bank) {
       Bank update = bankRepo.findById(bank.getBank_id()).orElseThrow();
       update.setBank_name(bank.getBank_name());
       update.setAddress(bank.getAddress());
       bankRepo.save(update);

    }

    @Override
    public void deleteBank(Bank bank) {
        bankRepo.delete(bank);
    }

}
