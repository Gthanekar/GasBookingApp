package com.cg.gas.booking.GasBooking.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gas_booking")
public class GasBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int gasBookingId;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;
	@Column
	private LocalDate bookingDate;
	@Column
	private boolean status;
	@Column
	private float bill;
	
	public GasBooking() {
		// TODO Auto-generated constructor stub
	}

	public int getGasBookingId() {
		return gasBookingId;
	}

	public void setGasBookingId(int gasBookingId) {
		this.gasBookingId = gasBookingId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "GasBooking [gasBookingId=" + gasBookingId + ", customerId=" + customerId + ", bookingDate="
				+ bookingDate + ", status=" + status + ", bill=" + bill + "]";
	}

}
