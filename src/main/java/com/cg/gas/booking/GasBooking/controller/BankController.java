package com.cg.gas.booking.GasBooking.controller;

import com.cg.gas.booking.GasBooking.model.Bank;
import com.cg.gas.booking.GasBooking.serviceImpl.BankImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankController {
@Autowired
private BankImpl bankImpl;
    @PostMapping(path="/insertBank")
    public ResponseEntity<Bank> insertBankBank(@RequestBody Bank bank) {
        bankImpl.insertBankBank(bank);
        return new ResponseEntity<Bank>(HttpStatus.OK);

    }

    @PutMapping(path="/updateBank")
    public ResponseEntity<Bank>  updateBank(@RequestBody Bank bank){
        bankImpl.updateBank(bank);
        return new ResponseEntity<Bank>(HttpStatus.OK);
    }

    @DeleteMapping(path="/deleteBank")
    public ResponseEntity<Bank>  deleteBank(@RequestBody Bank bank){
        bankImpl.deleteBank(bank);
        return new ResponseEntity<Bank>(HttpStatus.OK);
    }
}
