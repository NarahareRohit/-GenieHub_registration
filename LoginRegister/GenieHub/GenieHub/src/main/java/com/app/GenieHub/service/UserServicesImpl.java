package com.app.GenieHub.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.GenieHub.dto.LoginRequestDTO;
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
		System.out.println(userDTO.getFirstName()+" " +userDTO.getEmail());
		UserEntity newUser = mapper.map(userDTO, UserEntity.class);
		System.out.println();
		userRepository.save(newUser);
		return newUser;
	}

	@Override
	public UserEntity loginUser(LoginRequestDTO requestDTO) {
		String email = requestDTO.getEmail();
		String password = requestDTO.getPassword();
		return null;
	}
	
}
