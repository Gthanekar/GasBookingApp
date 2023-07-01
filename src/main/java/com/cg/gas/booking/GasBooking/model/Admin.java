package com.cg.gas.booking.GasBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int a_id;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	@Override
	public String toString() {
		return "Admin [a_id=" + a_id + "]";
	}

}
