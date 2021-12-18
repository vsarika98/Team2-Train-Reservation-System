package com.capgemini.ttrms.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Ticket implements Serializable {
@Id
@GeneratedValue
private int ticketId;
private long pnrNumber;
private String customerName;
private String startLocation;
private String endLocation;
private String time;
private String trainName;
private int platformNo;
private double price;
public Ticket() {
	super();
}
public Ticket(int ticketId, long pnrNumber, String customerName, String startLocation, String endLocation, String time,
		String trainName, int platformNo, double price) {
	super();
	this.ticketId = ticketId;
	this.pnrNumber = pnrNumber;
	this.customerName = customerName;
	this.startLocation = startLocation;
	this.endLocation = endLocation;
	this.time = time;
	this.trainName = trainName;
	this.platformNo = platformNo;
	this.price = price;
}
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public long getPnrNumber() {
	return pnrNumber;
}
public void setPnrNumber(long pnrNumber) {
	this.pnrNumber = pnrNumber;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getStartLocation() {
	return startLocation;
}
public void setStartLocation(String startLocation) {
	this.startLocation = startLocation;
}
public String getEndLocation() {
	return endLocation;
}
public void setEndLocation(String endLocation) {
	this.endLocation = endLocation;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}
public int getPlatformNo() {
	return platformNo;
}
public void setPlatformNo(int platformNo) {
	this.platformNo = platformNo;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

	


}
