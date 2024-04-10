package com.microservices.employee.employeedetails.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(url = "http://localhost:8081",value = "project-feign-client",path = "/api/project")
public interface ProjectFeign {

	@GetMapping("/{proj_id}")
	feign.Response getProjectByCode(@PathVariable(name = "proj_id") long proj_id) ;
		
	
}
