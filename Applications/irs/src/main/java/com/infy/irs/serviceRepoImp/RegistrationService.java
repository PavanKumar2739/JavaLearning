package com.infy.irs.serviceRepoImp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.irs.Dto.User;
import com.infy.irs.entity.UserEntity;
import com.infy.irs.exception.UserIdAlreadyPresentException;
import com.infy.irs.repository.UserRepository;
import com.infy.irs.serviceRepo.RegistrationRepo;

@Service
public class RegistrationService implements RegistrationRepo {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public void registerUser(User user) throws UserIdAlreadyPresentException {
		boolean ue = userRepository.existsById(user.getUserId());
		if (ue)
			throw new UserIdAlreadyPresentException("RegistrationService.USERID_PRESENT");
		//UserEntity userEntity = new UserEntity();
		UserEntity userEntity=modelMapper.map(user,UserEntity.class);
		userRepository.saveAndFlush(userEntity);
	}
}
