package com.cg.gas.booking.GasBooking.model;

import java.time.LocalDate;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "surrender_cylinder")
public class SurrenderCylinder {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Surrender_Id")
	private int surrenderId;
	@Column(name = "SurrenderDate")
	private LocalDate surrenderDate;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToOne
	@JoinColumn(name = "cylinderId")
	@Autowired
	private Cylinder cylinder;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@OneToOne
	@JoinColumn(name = "Customer_Id")
	@Autowired
	private Customer customer;

	public SurrenderCylinder(int surrenderId, LocalDate surrenderDate, Cylinder cylinder, Customer customer) {
		super();
		this.surrenderId = surrenderId;
		this.surrenderDate = surrenderDate;
		this.cylinder = cylinder;
		this.customer = customer;
	}
	public SurrenderCylinder() {
		
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

	public Cylinder getCylinder() {
		return cylinder;
	}

	public void setCylinder(Cylinder cylinder) {
		this.cylinder = cylinder;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "SurrenderCylinder [surrenderId=" + surrenderId + ", surrenderDate=" + surrenderDate + ", cylinder="
				+ cylinder + ", customer=" + customer + "]";
	}

}
