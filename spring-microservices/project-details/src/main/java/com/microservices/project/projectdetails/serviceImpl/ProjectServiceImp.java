package com.microservices.project.projectdetails.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.project.projectdetails.entity.Project;
import com.microservices.project.projectdetails.repo.ProjectRepository;
import com.microservices.project.projectdetails.service.ProjectService;


@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public Project saveProject(Project project) {
		
		Project saveProj=projectRepository.save(project);
		
		return saveProj;
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		System.out.println("project code called");
		Project getProj=projectRepository.findByProjCode(projectCode);
		return getProj;
	}

}
