
package com.cg.gas.booking.GasBooking.serviceInterface;

import com.cg.gas.booking.GasBooking.model.Admin;

public interface AdminInterface {

	public void insertAdmin(Admin admin);

	public void updateAdmin(Admin admin);

	public void deleteAdmin(Admin admin);

	public void getAllbookings(Admin admin);

	public void getAllbookingsForDays(Admin admin);

}
