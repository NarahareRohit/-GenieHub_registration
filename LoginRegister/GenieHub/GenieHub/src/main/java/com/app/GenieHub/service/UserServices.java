package com.app.GenieHub.service;

import com.app.GenieHub.dto.UserDTO;
import com.app.GenieHub.entity.UserEntity;

public interface UserServices {

	UserEntity addNewUser(UserDTO userDTO);
	
}
