package com.cg.gas.booking.GasBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GasBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GasBookingApplication.class, args);
		System.out.println("Connected");
	}
}
