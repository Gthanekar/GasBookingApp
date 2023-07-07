package com.cg.gas.booking.GasBooking.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.cg.gas.booking.GasBooking.model.Customer;
import com.cg.gas.booking.GasBooking.model.GasBooking;

public interface GasBookingInterface {

	public void insertGasBooking(int id,GasBooking gasBooking);

	public void updateGasBooking(GasBooking gasBooking);

	public void deleteGasBooking(int gasBookingId);

	public List<GasBooking> getBill(int customerId);



}
