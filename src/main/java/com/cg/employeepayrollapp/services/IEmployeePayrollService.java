package com.cg.employeepayrollapp.services;

import java.util.List;

import com.cg.employeepayrollapp.dto.EmployeePayrollDTO;
import com.cg.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeeDTO);

	EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeeDTO);

	void deleteEmployeePayrollData(int empId);

}
