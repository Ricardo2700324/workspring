package com.ricardo.workspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.workspring.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
}
