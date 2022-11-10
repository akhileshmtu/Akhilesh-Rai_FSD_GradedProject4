package com.gl.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gl.ems.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>, JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.username = ?1")
	public User getUserByUsername(String username);

}
