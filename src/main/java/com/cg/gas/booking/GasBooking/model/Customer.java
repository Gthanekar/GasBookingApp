package com.cg.gas.booking.GasBooking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;
	@Id
	private int cylinderId ;
	@Id
	private int bankId;
	@Column
	private int accountNo;
	@Column
	private String ifscNo;
	@Column
	private String pan;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCylinderId() {
		return cylinderId;
	}

	public void setCylinderId(int cylinderId) {
		this.cylinderId = cylinderId;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscNo() {
		return ifscNo;
	}

	public void setIfscNo(String ifscNo) {
		this.ifscNo = ifscNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cylinderId=" + cylinderId + ", bankId=" + bankId
				+ ", accountNo=" + accountNo + ", ifscNo=" + ifscNo + ", pan=" + pan + "]";
	}

}
	