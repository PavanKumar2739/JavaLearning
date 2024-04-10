package com.microservices.employee.employeedetails.service;

import org.springframework.stereotype.Service;

import com.microservices.employee.employeedetails.entity.Employee;
import com.microservices.employee.employeedetails.payload.EmployeeDto;


@Service
public interface EmployeeService {

	public EmployeeDto saveEmployee(Employee employee);
	public EmployeeDto getEmployeeById(long id);
}
