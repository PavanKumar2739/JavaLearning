package com.infy.irs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.irs.Dto.User;
import com.infy.irs.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
