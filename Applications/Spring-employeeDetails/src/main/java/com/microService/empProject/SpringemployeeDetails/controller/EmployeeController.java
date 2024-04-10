package com.microService.empProject.SpringemployeeDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microService.empProject.SpringemployeeDetails.entity.Employee;
import com.microService.empProject.SpringemployeeDetails.payload.EmployeeDto;
import com.microService.empProject.SpringemployeeDetails.service.EmployeeService;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	public EmployeeService  employeeService;
	
	@PostMapping("/employee")
	public String saveEmployee(Employee emp) {
		 employeeService.saveEmployee(emp);
		 return "success1"; 
		
	}
	@GetMapping("/{emp_id}")
	public EmployeeDto getEmployee(@PathVariable(name = "emp_id") long emp_id) {
		return employeeService.getEmployeeById(emp_id);
	}

}
