package com.app.GenieHub.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="users")
@ToString(exclude = "password")
public class UserEntity extends BaseEntity{

	@NonNull
	@Column
	private String firstName; 
	
	@NonNull
	@Column
	private String lastName; 
	
	@NonNull
	@Column(unique = true)
	private String email; 
	
	@NonNull
	@Column
	private String password; 
	
	@NonNull
	@Column
	private Long moblieNumber;

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

	public Long getMoblieNumber() {
		return moblieNumber;
	}

	public void setMoblieNumber(Long moblieNumber) {
		this.moblieNumber = moblieNumber;
	}
	
	
	
	
}
