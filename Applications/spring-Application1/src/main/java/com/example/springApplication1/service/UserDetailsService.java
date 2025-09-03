package com.example.springApplication1.service;

import org.springframework.stereotype.Service;

import com.example.springApplication1.payloadDTO.UserDetailsDto;


public interface UserDetailsService{
	public UserDetailsDto saveusUserDetails(UserDetailsDto userDetailsDto);
}
