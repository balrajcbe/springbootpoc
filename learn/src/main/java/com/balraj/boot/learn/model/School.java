package com.balraj.boot.learn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
	@Id
	@Column
	private String regNo;
	@Column
	private String name;
	@Column
	private String address;
	
	public School() {
	}
	
	public School(String regNo, String name, String address) {
		this.regNo = regNo;
		this.name = name;
		this.address = address;
	}
	
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "School [regNo=" + regNo + ", name=" + name + ", address=" + address + "]";
	}
}
