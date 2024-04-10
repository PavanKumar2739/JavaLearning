package com.microservices.project.projectdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.project.projectdetails.entity.Project;
import com.microservices.project.projectdetails.service.ProjectService;


@RestController
@RequestMapping("/api/project")
public class ProjectController {

	@Autowired
	public ProjectService projectService;
	
	@PostMapping
	public Project saveProject(@RequestBody Project project) {
		return projectService.saveProject(project);
	}
	@GetMapping("/{proj_id}")
	public Project getProject(@PathVariable(name = "proj_id") long proj_id) {
		System.out.println("project code called");
		return projectService.getProjectByCode(proj_id);
	}
}

