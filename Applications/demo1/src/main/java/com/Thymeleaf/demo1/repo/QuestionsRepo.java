package com.Thymeleaf.demo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Thymeleaf.demo1.entity.questions;

public interface QuestionsRepo extends JpaRepository<questions, Long>{

}
