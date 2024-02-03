package com.app.GenieHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.GenieHub.dto.UserDTO;
import com.app.GenieHub.service.UserServices;

@RestController
@RequestMapping
public class UserRegistrationLoginController {

	@Autowired
	private UserServices userServices;
	
	public ResponseEntity<?> registerNewUser(@RequestBody UserDTO userDTO){
		return ResponseEntity.status(HttpStatus.CREATED).body(userServices.addNewUser(userDTO));
	}
	
} 
