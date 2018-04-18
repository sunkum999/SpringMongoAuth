package com.our.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.our.domain.UserDomain;

public interface AuthRepository extends MongoRepository<UserDomain, Integer> {
	
	List<UserDomain> findByUserName(String userName);
	
	List<UserDomain> findByPassword(String password);
	
}
