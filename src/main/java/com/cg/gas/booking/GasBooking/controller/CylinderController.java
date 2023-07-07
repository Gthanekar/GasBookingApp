package com.cg.gas.booking.GasBooking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.gas.booking.GasBooking.model.Customer;
import com.cg.gas.booking.GasBooking.model.Cylinder;
import com.cg.gas.booking.GasBooking.serviceImpl.CylinderServiceImpl;

@RestController
@RequestMapping("/Cylinder")
public class CylinderController {

	@Autowired
	CylinderServiceImpl cylinderServiceImpl;

	@PostMapping("/insertCylinder")
	public ResponseEntity<Cylinder> insertCylinder(@RequestBody Cylinder cylinder) {
		cylinderServiceImpl.insertCylinder(cylinder);
		return new ResponseEntity<Cylinder>(HttpStatus.OK);
	}

	@PutMapping("/updateCylinder")
	public ResponseEntity<Cylinder> updateCylinder(@RequestBody Cylinder cylinder) {
		cylinderServiceImpl.updateCylinder(cylinder);
		return new ResponseEntity<Cylinder>(HttpStatus.OK);
	}

	@DeleteMapping("/deleteCylinder/{id}")
	public ResponseEntity<Customer> deleteCylinder(@PathVariable("id") int id) {
		cylinderServiceImpl.deleteCylinder(id);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@GetMapping("/getCylinderByType/{type}")
	public ResponseEntity<Optional<Cylinder>> getCylinderBytype(@PathVariable("type") String type) {
		return ResponseEntity.ok().body(cylinderServiceImpl.viewCylinderByType(type));
	}

}
