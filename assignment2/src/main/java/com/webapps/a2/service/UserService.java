package com.webapps.a2.service;

import com.webapps.a2.model.User;
import com.webapps.a2.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
