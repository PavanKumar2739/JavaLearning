package com.microService.empProject.SpringemployeeDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microService.empProject.SpringemployeeDetails.entity.Project;
import com.microService.empProject.SpringemployeeDetails.service.ProjectService;


@Controller
public class ProjectController {

	@Autowired
	public ProjectService projectService;
	
	@GetMapping (value = "/")
	public String home() {
			return "front";
		}
	
	@PostMapping("/projectDetails")
	public String saveProject(Project project) {
		 projectService.saveProject(project);
		 return "employee";
	}
	@GetMapping("/{proj_id}")
	public Project getProject(@PathVariable(name = "proj_id") long proj_id) {
		return projectService.getProjectByCode(proj_id);
	}
}

