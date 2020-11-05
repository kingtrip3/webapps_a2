package com.webapps.a2.service;

import java.util.Arrays;
import org.springframework.stereotype.Service;

import com.webapps.a2.model.Role;
import com.webapps.a2.model.User;
import com.webapps.a2.repository.UserRepository;
import com.webapps.a2.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(),
				registrationDto.getLastName(), registrationDto.getEmail(), 
				registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
		
	}

}
