package com.example.springApplication1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springApplication1.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}
