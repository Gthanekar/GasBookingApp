package com.cg.gas.booking.GasBooking.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cylinder")
public class Cylinder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int cylinderId;
	@Column
	private String type;
	@Column
	private float weight;
	@Column
	private String strapColor;
	@Column
	private float price;
	
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}

	public int getCylinderId() {
		return cylinderId;
	}

	public void setCylinderId(int cylinderId) {
		this.cylinderId = cylinderId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getStrapColor() {
		return strapColor;
	}

	public void setStrapColor(String strapColor) {
		this.strapColor = strapColor;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cylinder [cylinderId=" + cylinderId + ", type=" + type + ", weight=" + weight + ", strapColor="
				+ strapColor + ", price=" + price + "]";
	}

}
