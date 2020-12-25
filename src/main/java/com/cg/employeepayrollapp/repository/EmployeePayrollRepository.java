package com.cg.employeepayrollapp.repository;

import com.cg.employeepayrollapp.model.EmployeePayrollData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {
    
}
