
package com.cg.gas.booking.GasBooking.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.gas.booking.GasBooking.model.Customer;
import com.cg.gas.booking.GasBooking.model.GasBooking;
import com.cg.gas.booking.GasBooking.repository.CustomerRepo;
import com.cg.gas.booking.GasBooking.repository.GasBookingRepo;
import com.cg.gas.booking.GasBooking.serviceInterface.GasBookingInterface;

@Service
public class GasBookingImpl implements GasBookingInterface {

	@Autowired
	GasBookingRepo gasbookingRepo;
	@Autowired
	CustomerRepo customerRepo;

	@Override
	public void insertGasBooking(int id, GasBooking gasBooking) {

		Optional<Customer> cust = customerRepo.findById(id);
		if (cust.isPresent()) {
			gasBooking.setCustomer(cust.get());
			List<GasBooking> gasBokkings = cust.get().getGasBookings();
			gasBokkings.add(gasBooking);
			cust.get().setGasBookings(gasBokkings);
			customerRepo.save(cust.get());

		}
		gasbookingRepo.save(gasBooking);
	}

	@Override
	public void updateGasBooking(GasBooking gasBooking) {
		GasBooking update = gasbookingRepo.findById(gasBooking.getGasBookingId()).orElseThrow();
		update.setBookingDate(gasBooking.getBookingDate());
		update.setBill(gasBooking.getBill());
		update.setStatus(gasBooking.isStatus());
		gasbookingRepo.save(update);

	}

	@Override
	public void deleteGasBooking(int gasBookingId) {
//		Optional<GasBooking> gasBookings = gasbookingRepo.findById(gasBookingId);
		gasbookingRepo.deleteById(gasBookingId);

	}

	@Override
	public List<GasBooking> getBill(int customerId) {
		Optional<Customer> cust = customerRepo.findById(customerId);
		if (cust.isPresent()) {
			return (List<GasBooking>) cust.get().getGasBookings();
		}
		return null;
	}

}
