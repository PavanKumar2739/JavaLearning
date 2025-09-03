package com.example.springApplication1.serviceImplimentation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springApplication1.entity.UserDetails;
import com.example.springApplication1.entity.Users;
import com.example.springApplication1.exception.UserNotFound;
import com.example.springApplication1.payloadDTO.UserDetailsDto;
import com.example.springApplication1.repository.UserDetailsRepository;
import com.example.springApplication1.repository.UserRepository;
import com.example.springApplication1.service.UserDetailsService;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public UserDetailsDto saveusUserDetails( UserDetailsDto userDetailsDto) {
		
		Users user= userRepository.findByEmail(userDetailsDto.getEmail()).orElseThrow(() -> new UserNotFound(String.format("Uasr with %d not found", userDetailsDto.getEmail())));
		UserDetails userDetails=modelMapper.map(userDetailsDto, UserDetails.class);
		
		userDetails.setUser(user);
		System.out.println(userDetailsDto.getEmail());
		System.out.println(userDetailsDto.getGender());
		System.out.println(userDetailsDto.getAddress());
		UserDetails saveDetails= userDetailsRepository.save(userDetails);
		
		return modelMapper.map(saveDetails, UserDetailsDto.class);
		
	}
	

}
