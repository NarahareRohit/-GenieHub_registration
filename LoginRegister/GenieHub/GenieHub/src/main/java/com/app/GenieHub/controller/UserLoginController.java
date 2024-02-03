package com.app.GenieHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.GenieHub.dto.LoginRequestDTO;
import com.app.GenieHub.entity.UserEntity;
import com.app.GenieHub.service.UserServices;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/login")
public class UserLoginController {
	
	@Autowired
	private UserServices userServices;
	
	@PostMapping
	public ResponseEntity<UserEntity> singUp(@RequestBody @Valid LoginRequestDTO requestDTO){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
	}
	
	
	
}
