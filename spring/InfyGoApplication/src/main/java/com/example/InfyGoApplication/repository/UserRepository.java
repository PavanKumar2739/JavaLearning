package com.example.InfyGoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.InfyGoApplication.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
