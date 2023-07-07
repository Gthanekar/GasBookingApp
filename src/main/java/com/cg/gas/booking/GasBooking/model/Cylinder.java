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
	@Column(name = "cylinderId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int cylinderId;
	@Column(name = "type")
	private String type;
	@Column(name = "weight")
	private float weight;
	@Column(name = "strapColor")
	private String strapColor;
	@Column(name = "price")
	private float price;

	public Cylinder(int cylinderId, String type, float weight, String strapColor, float price) {
		super();
		this.cylinderId = cylinderId;
		this.type = type;
		this.weight = weight;
		this.strapColor = strapColor;
		this.price = price;
	}

	public Cylinder() {

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
