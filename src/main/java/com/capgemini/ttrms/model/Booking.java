package com.capgemini.ttrms.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Booking implements Serializable{

	@Id
	@GeneratedValue
	private int bookingId;
	private String departureDate;
	private String sourceStation;
	private String returnDate;
	private String destinationStation;
	private int numOfSeats;
	private String passengerName;
	private double price;
	public Booking() {
		super();
	}
	public Booking(int bookingId, String departureDate, String sourceStation, String returnDate,
			String destinationStation, int numOfSeats, String passengerName, double price) {
		super();
		this.bookingId = bookingId;
		this.departureDate = departureDate;
		this.sourceStation = sourceStation;
		this.returnDate = returnDate;
		this.destinationStation = destinationStation;
		this.numOfSeats = numOfSeats;
		this.passengerName = passengerName;
		this.price = price;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
