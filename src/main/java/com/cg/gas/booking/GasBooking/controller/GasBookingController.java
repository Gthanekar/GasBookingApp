
package com.cg.gas.booking.GasBooking.controller;

import java.util.List;

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


import com.cg.gas.booking.GasBooking.model.GasBooking;
import com.cg.gas.booking.GasBooking.serviceImpl.GasBookingImpl;

@RestController
@RequestMapping("/gasBooking")
public class GasBookingController {

	@Autowired
	GasBookingImpl gasBookingimpl;

	@PostMapping("/insertGasBooking/{id}")
	public ResponseEntity<GasBooking> insertBankBank(@PathVariable("id") String id, @RequestBody GasBooking gasBooking) {
		gasBookingimpl.insertGasBooking(Integer.parseInt(id), gasBooking);
		return new ResponseEntity<GasBooking>(HttpStatus.OK);

	}

	@PutMapping(path = "/updateGasBooking")
	public ResponseEntity<GasBooking> updateBank(@RequestBody GasBooking gasBooking) {
		gasBookingimpl.updateGasBooking(gasBooking);
		return new ResponseEntity<GasBooking>(HttpStatus.OK);
	}

	@DeleteMapping(path = "/deleteGasBooking/{id}")
	public ResponseEntity<GasBooking> deleteBank(@PathVariable("id")int id) {
		gasBookingimpl.deleteGasBooking(id);
		return new ResponseEntity<GasBooking>(HttpStatus.OK);
	}
	@GetMapping(path = "/getBill/{id}")
	public ResponseEntity<List<GasBooking>> getBookingById(@PathVariable("id")String id) {
		return ResponseEntity.ok().body(gasBookingimpl.getBill(Integer.parseInt(id)));
	}
}
