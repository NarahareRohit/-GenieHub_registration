package com.app.GenieHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.GenieHub.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
