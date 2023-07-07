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

import com.cg.gas.booking.GasBooking.model.SurrenderCylinder;
import com.cg.gas.booking.GasBooking.serviceImpl.SurrenderCylinderServiceImpl;

@RestController
@RequestMapping("/surrenderSc")
public class SurrenderCylinderController {

	@Autowired
	SurrenderCylinderServiceImpl scImpl;

	@PostMapping("/insertSc")
	public ResponseEntity<SurrenderCylinder> insertSc(@RequestBody SurrenderCylinder sc) {
		scImpl.insertSurrenderCylinder(sc);
		return new ResponseEntity<SurrenderCylinder>(HttpStatus.OK);
	}

	@PutMapping("/updateSc")
	public ResponseEntity<SurrenderCylinder> updateSC(@RequestBody SurrenderCylinder sc) {
		scImpl.updateSurrenderCylinder(sc);
		return new ResponseEntity<SurrenderCylinder>(HttpStatus.OK);
	}

	@DeleteMapping("/deleteSc")
	public ResponseEntity<SurrenderCylinder> deleteSc(@RequestBody SurrenderCylinder sc) {
		scImpl.deleteSurrenderCylinder(sc);
		return new ResponseEntity<SurrenderCylinder>(HttpStatus.OK);
	}

}
