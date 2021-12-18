package com.capgemini.ttrms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Generated;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Train {
	@Id
	@GeneratedValue
	private int trainNo;
	@NotBlank(message = "train name not be null")
	private String trainName;
	private String trainDate;
	private String arrivalTime;
	private String departureTime;
	private int availableOfSeat;
	private String source;
	private String station;
	private int distance;
	public Train() {
		super();
	}
	public Train(int trainNo, @NotBlank(message = "train name not be null") String trainName, String trainDate,
			String arrivalTime, String departureTime, int availableOfSeat, String source, String station,
			int distance) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.trainDate = trainDate;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.availableOfSeat = availableOfSeat;
		this.source = source;
		this.station = station;
		this.distance = distance;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainDate() {
		return trainDate;
	}
	public void setTrainDate(String trainDate) {
		this.trainDate = trainDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public int getAvailableOfSeat() {
		return availableOfSeat;
	}
	public void setAvailableOfSeat(int availableOfSeat) {
		this.availableOfSeat = availableOfSeat;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
	
	
}
