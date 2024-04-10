package com.microservices.project.projectdetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.project.projectdetails.entity.Project;


public interface ProjectRepository extends JpaRepository<Project, Long>{
Project findByProjCode(long employeeAssignedProject);
}
