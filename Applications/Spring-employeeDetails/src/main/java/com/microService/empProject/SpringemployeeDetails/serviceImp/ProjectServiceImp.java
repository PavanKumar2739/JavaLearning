package com.microService.empProject.SpringemployeeDetails.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microService.empProject.SpringemployeeDetails.entity.Project;
import com.microService.empProject.SpringemployeeDetails.repo.ProjectRepository;
import com.microService.empProject.SpringemployeeDetails.service.ProjectService;

@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public void saveProject(Project project) {
		Project saveProj=projectRepository.save(project);
		
		
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		Project getProj=projectRepository.findByProjCode(projectCode);
		return getProj;
	}

}
