package com.capgemini.ttrms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Customer implements Serializable {
	@Id
	@GeneratedValue
	private int customerId;
	@NotBlank(message = "Customer Name cannot be null")
	private String customerName;
	@NotBlank(message = "Password is at least 4 digit")
	private String password;
	private String confirmPassword;
	private String gender;
	
	private String phone;
	
	@NotBlank(message = "email cannot be empty")
	private String email;
	private String dob;
	public Customer() {
		super();
	}
	public Customer(int customerId, @NotBlank(message = "Customer Name cannot be null") String customerName,
			@NotBlank(message = "Password is at least 4 digit") String password, String confirmPassword, String gender,
			String phone, @NotBlank(message = "email cannot be empty") String email, String dob) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
}