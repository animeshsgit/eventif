package com.EMA.EMA.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String department;
	private String status;
	private int phone;
	private String address;
	
	public Employee(int id, String name, String department, String status, int phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.status = status;
		this.phone = phone;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", status=" + status
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
