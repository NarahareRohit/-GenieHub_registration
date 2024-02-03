package com.app.GenieHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.GenieHub.dto.UserDTO;
import com.app.GenieHub.service.UserServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserRegistrationLoginController {

	@Autowired
	private UserServices userServices;
	
	@PostMapping
	public ResponseEntity<?> registerNewUser(@RequestBody @Valid UserDTO userDTO){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userServices.addNewUser(userDTO));
	}
	
	
	
	
	
	
} 
