package com.microservices.employee.employeedetails.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.microservices.employee.employeedetails.entity.Employee;
import com.microservices.employee.employeedetails.feignClient.ProjectFeign;
import com.microservices.employee.employeedetails.payload.EmployeeDto;
import com.microservices.employee.employeedetails.payload.Project;
import com.microservices.employee.employeedetails.repo.EmployeeRepository;
import com.microservices.employee.employeedetails.service.EmployeeService;

import feign.Response;


@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectFeign projectFeign;
	@Override
	public EmployeeDto saveEmployee(Employee employee) {
		Employee saveEmp=employeeRepository.save(employee);
		Response responce=projectFeign.getProjectByCode(saveEmp.getEmpProjCode());
		//System.out.println(responce.body().toString());
		String body=responce.body().toString();
		Gson gson=new Gson();
		Project project=gson.fromJson(body, Project.class);
		EmployeeDto empDto=new EmployeeDto();
		empDto.setId(saveEmp.getId());
		empDto.setName(saveEmp.getName());
		empDto.setEmail(saveEmp.getEmail());
		
		empDto.setEmpBaseLocation(saveEmp.getEmpBaseLocation());
		empDto.setEmpProjCode(project.getProjCode());
		empDto.setProjName(project.getProjName());
		return empDto;
	}

	@Override
	public EmployeeDto getEmployeeById(long id) {
		Employee getEmp=employeeRepository.findById(id).get();
		Response responce=projectFeign.getProjectByCode(getEmp.getEmpProjCode());
//		System.out.println(responce.body().toString());
//		System.out.println(responce.body().toString()); //should not use responce multiple times
		String body=responce.body().toString();
		Gson gson=new Gson();
		Project project=gson.fromJson(body, Project.class);
		EmployeeDto empDto=new EmployeeDto();
		empDto.setId(getEmp.getId());
		empDto.setName(getEmp.getName());
		empDto.setEmail(getEmp.getEmail());
		
		empDto.setEmpBaseLocation(getEmp.getEmpBaseLocation());
		empDto.setEmpProjCode(project.getProjCode());
		empDto.setProjName(project.getProjName());
		return empDto;
	}

}
