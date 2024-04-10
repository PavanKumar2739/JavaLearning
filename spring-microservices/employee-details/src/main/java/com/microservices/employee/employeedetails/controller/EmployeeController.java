package com.microservices.employee.employeedetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.employee.employeedetails.entity.Employee;
import com.microservices.employee.employeedetails.payload.EmployeeDto;
import com.microservices.employee.employeedetails.service.EmployeeService;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	public EmployeeService  employeeService;
	
	@PostMapping
	public EmployeeDto saveEmployee(@RequestBody Employee emp) {
		return employeeService.saveEmployee(emp);
		
	}
	@GetMapping("/{emp_id}")
	public EmployeeDto getEmployee(@PathVariable(name = "emp_id") long emp_id) {
		return employeeService.getEmployeeById(emp_id);
	}

}
