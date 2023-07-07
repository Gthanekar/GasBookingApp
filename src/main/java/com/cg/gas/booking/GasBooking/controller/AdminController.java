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

import com.cg.gas.booking.GasBooking.model.Admin;
import com.cg.gas.booking.GasBooking.serviceImpl.AdminImpl;

@RestController
@RequestMapping("/admin")
class AdminController {

	@Autowired
	private AdminImpl adminImpl;

	@PostMapping(path = "/insertAdmin")
	public ResponseEntity<Admin> insertBankBank(@RequestBody Admin admin) {
		adminImpl.insertAdmin(admin);
		return new ResponseEntity<Admin>(HttpStatus.OK);

	}
	@PutMapping(path = "/updateAdmin")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
		adminImpl.updateAdmin(admin);
		return new ResponseEntity<Admin>(HttpStatus.OK);

	}
	@DeleteMapping(path = "/deleteAdmin")
	public ResponseEntity<Admin> deleteAdmin(@RequestBody Admin admin) {
		adminImpl.deleteAdmin(admin);
		return new ResponseEntity<Admin>(HttpStatus.OK);

	}
}