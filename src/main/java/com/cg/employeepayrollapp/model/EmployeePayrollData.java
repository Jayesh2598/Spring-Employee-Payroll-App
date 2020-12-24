package com.cg.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import com.cg.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

public @Data class EmployeePayrollData {
	private int employeeId;
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	private List<String> departments;

	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		this.employeeId = empId;
		this.updateEmployeePayrollData(employeePayrollDTO);
	}

	public void updateEmployeePayrollData(EmployeePayrollDTO dto) {
		this.name = dto.name;
		this.salary = dto.salary;
		this.gender = dto.gender;
		this.startDate = dto.startDate;
		this.note = dto.note;
		this.profilePic = dto.profilePic;
		this.departments = dto.departments;
	}
}
