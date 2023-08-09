package com.mycompany.propertymanagement.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;


public class UserDTO {
	
	private String ownerName;
	@Column( nullable=false)
	private String email;
	private String phone;
	private String password;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}