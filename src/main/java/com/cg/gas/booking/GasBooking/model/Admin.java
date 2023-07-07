package com.cg.gas.booking.GasBooking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = jakarta.persistence.InheritanceType.SINGLE_TABLE)
@Table(name = "admin")
public class Admin extends AbstractUser {

	@Id
	@Column(name = "a_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int aId;

	public Admin(int abstractUserid, String userName, String password, String address, String email) {
		super(userName, password, address, email);
		// TODO Auto-generated constructor stub
	}

	public Admin() {

	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	@Override
	public String toString() {
		return "Admin [a_id=" + aId + "]";
	}

}
