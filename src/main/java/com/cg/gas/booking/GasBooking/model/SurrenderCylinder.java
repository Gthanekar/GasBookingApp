package com.cg.gas.booking.GasBooking.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "surrender_cylinder")
public class SurrenderCylinder {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int surrenderId;
	@Column
	private LocalDate surrenderDate;
//	@Column
//	private Cylinder cylinder;
//	@Column
//	private Customer customer;

	public SurrenderCylinder() {
		// TODO Auto-generated constructor stub
	}

	public int getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(int surrenderId) {
		this.surrenderId = surrenderId;
	}

	public LocalDate getSurrenderDate() {
		return surrenderDate;
	}

	public void setSurrenderDate(LocalDate surrenderDate) {
		this.surrenderDate = surrenderDate;
	}
//
//	public Cylinder getCylinder() {
//		return cylinder;
//	}
//
//	public void setCylinder(Cylinder cylinder) {
//		this.cylinder = cylinder;
//	}

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

//	@Override
//	public String toString() {
//		return "SurrenderCylinder [surrenderId=" + surrenderId + ", surrenderDate=" + surrenderDate + ", cylinder="
//				+ cylinder + ", customer=" + customer + "]";
//	}

}
