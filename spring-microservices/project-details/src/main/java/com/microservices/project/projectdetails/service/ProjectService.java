package com.microservices.project.projectdetails.service;

import org.springframework.stereotype.Service;

import com.microservices.project.projectdetails.entity.Project;



public interface ProjectService {
	public Project saveProject(Project project);

	public Project getProjectByCode(long projectCode);
}
