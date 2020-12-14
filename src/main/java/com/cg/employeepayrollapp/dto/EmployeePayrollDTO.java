package com.cg.employeepayrollapp.dto;

public class EmployeePayrollDTO {

	public String name;
	public long salary;

	public EmployeePayrollDTO(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "name=" + name + ":salary=" + salary;
	}
}