package com.microService.empProject.SpringemployeeDetails.service;

import org.springframework.stereotype.Service;

import com.microService.empProject.SpringemployeeDetails.entity.Employee;
import com.microService.empProject.SpringemployeeDetails.payload.EmployeeDto;

@Service
public interface EmployeeService {

	public void saveEmployee(Employee employee);
	public EmployeeDto getEmployeeById(long id);
}
