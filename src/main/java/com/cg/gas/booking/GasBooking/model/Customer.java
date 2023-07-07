package com.cg.gas.booking.GasBooking.model;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = jakarta.persistence.InheritanceType.SINGLE_TABLE)
@Table(name = "customer")
public class Customer extends AbstractUser {

	public Customer(String userName, String password, String address, String email) {
		super(userName, password, address, email);

	}

	public Customer() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Customer_Id")
	private int customerId;
	@Column(name = "accountNo")
	private int accountNo;
	@Column(name = "IFSC_No")
	private String ifscNo;
	@Column(name = "pan")
	private String pan;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToOne
	@JoinColumn(name = "cylinderId")
	@Autowired
	private Cylinder cylinder;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToOne
	@JoinColumn(name = "Bank_id")
	@Autowired
	private Bank bank;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	@Autowired
	private List<GasBooking> gasBookings;

	public Cylinder getCylinder() {
		return cylinder;
	}

	public void setCylinder(Cylinder cylinder) {
		this.cylinder = cylinder;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public List<GasBooking> getGasBookings() {
		return gasBookings;
	}

	public void setGasBookings(List<GasBooking> gasBookings) {
		this.gasBookings = gasBookings;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountNo=" + accountNo + ", ifscNo=" + ifscNo + ", pan=" + pan
				+ ", cylinder=" + cylinder + ", bank=" + bank + "]";
	}

}
