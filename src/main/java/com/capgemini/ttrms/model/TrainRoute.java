package com.capgemini.ttrms.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class TrainRoute  implements Serializable{
	@Id
	@GeneratedValue
	private int routeId;
	@NotBlank(message="route Name cannot be null")
	private String routeName;
	private String first_station;
	private String last_station;
	private String train_name;
	private String train_Time;
	public TrainRoute() {
		super();
	}
	public TrainRoute(int routeId, @NotBlank(message = "route Name cannot be null") String routeName,
			String first_station, String last_station, String train_name, String train_Time) {
		super();
		this.routeId = routeId;
		this.routeName = routeName;
		this.first_station = first_station;
		this.last_station = last_station;
		this.train_name = train_name;
		this.train_Time = train_Time;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getFirst_station() {
		return first_station;
	}
	public void setFirst_station(String first_station) {
		this.first_station = first_station;
	}
	public String getLast_station() {
		return last_station;
	}
	public void setLast_station(String last_station) {
		this.last_station = last_station;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getTrain_Time() {
		return train_Time;
	}
	public void setTrain_Time(String train_Time) {
		this.train_Time = train_Time;
	}

	
}
