package com.app.GenieHub.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	@NotBlank(message = "first name can't be blank!!!")
	private String firstName; 
	private String lastName; 
	private String email; 
	private String password; 
	private int moblieNumber;
 
}
