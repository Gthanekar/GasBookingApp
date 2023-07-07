package com.cg.gas.booking.GasBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.gas.booking.GasBooking.model.Bank;
import com.cg.gas.booking.GasBooking.serviceImpl.BankImpl;

@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired
	private BankImpl bankImpl;

	@PostMapping(path = "/insertBank")
	public ResponseEntity<Bank> insertBankBank(@RequestBody Bank bank) {
		bankImpl.insertBankBank(bank);
		return new ResponseEntity<Bank>(HttpStatus.OK);
	}

	@PutMapping(path = "/updateBank")
	public ResponseEntity<Bank> updateBank(@RequestBody Bank bank) {
		bankImpl.updateBank(bank);
		return new ResponseEntity<Bank>(HttpStatus.OK);
	}

	@DeleteMapping(path = "/deleteBank")
	public ResponseEntity<Bank> deleteBank(@RequestBody Bank bank) {
		bankImpl.deleteBank(bank);
		return new ResponseEntity<Bank>(HttpStatus.OK);
	}
}