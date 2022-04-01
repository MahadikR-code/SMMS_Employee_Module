package com.tns.cg.smms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to create a table of this class
@Table(name = "Employee") // @Table annotation is used to provide details of the table that this entity
							// will be mapped to.
public class Employee {
	@Id // this is used to define the primery key1
	
	// Given Fields
	private Integer id;
	private String name;
	private LocalDate dob;
	private float salary;
	private String address;
	private String designation;

	// Creating Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	// Creating Constructor using fields
	public Employee(Integer id, String name, LocalDate dob, float salary, String address, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
	}

	// Creating constructor using super class
	public Employee() {

	}

	// private Shop shop;
}
