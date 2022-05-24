package com.databaseConnector.springProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee 
{
	@Id //making primary key
	private int id;
	private int salary;
	private String name;
	private String designation;
	
	public Employee() {
		super();
	}
	public Employee(int id, int salary, String name, String designation) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.setDesignation(designation);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
