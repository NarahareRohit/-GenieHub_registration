package com.app.GenieHub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class UserDTO {

	@NotBlank(message = "first name can't be blank!!!")
	private String firstName; 
	
	@NotBlank(message = "Last name can't be blank!!!")
	private String lastName; 
	
	@Email
	private String email; 
	
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})"
			, message = "Invalid password!!!")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password; 
	
	
	private int moblieNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoblieNumber() {
		return moblieNumber;
	}

	public void setMoblieNumber(int moblieNumber) {
		this.moblieNumber = moblieNumber;
	}
 
	
	
}
