package com.microservices.employee.employeedetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.employee.employeedetails.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
