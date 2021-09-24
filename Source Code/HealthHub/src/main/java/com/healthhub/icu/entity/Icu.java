package com.healthhub.icu.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "icu")
public class Icu {

	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIcuType() {
		return icuType;
	}
	public void setIcuType(String icuType) {
		this.icuType = icuType;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getNumOfBeds() {
		return numOfBeds;
	}
	public void setNumOfBeds(String numOfBeds) {
		this.numOfBeds = numOfBeds;
	}	
	
	@Id
	private String hospitalName;
	private String address;
	private String location;
	private String icuType;
	private String contact;
	private String numOfBeds;

}
