package com.cg.gas.booking.GasBooking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "abstract_user")
public class AbsractUser {
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String address;
	@Id
	private String email;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AbsractUser [userName=" + userName + ", password=" + password + ", address=" + address + ", email="
				+ email + "]";
	}
}
