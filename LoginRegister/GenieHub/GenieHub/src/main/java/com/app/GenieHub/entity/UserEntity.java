package com.app.GenieHub.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
@Table(name="user")
@ToString(exclude = "password")
public class UserEntity extends BaseEntity{

	@NonNull
	@Column
	private String firstName; 
	
	@NonNull
	@Column
	private String lastName; 
	
	@NonNull
	@Column
	private String email; 
	
	@NonNull
	@Column
	private String password; 
	
	@NonNull
	@Column
	private int moblieNumber;
	
}
