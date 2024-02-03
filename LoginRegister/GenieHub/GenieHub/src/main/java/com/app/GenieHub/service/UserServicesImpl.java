package com.app.GenieHub.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.GenieHub.dto.UserDTO;
import com.app.GenieHub.entity.UserEntity;
import com.app.GenieHub.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public UserEntity addNewUser(UserDTO userDTO) {
		UserEntity newUser = mapper.map(userDTO, UserEntity.class);
		userRepository.save(newUser);
		return newUser;
	}
	
}
