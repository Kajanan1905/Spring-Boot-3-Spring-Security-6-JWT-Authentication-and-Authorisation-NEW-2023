package com.kajanan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kajanan.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findEmailById(String email);

}
