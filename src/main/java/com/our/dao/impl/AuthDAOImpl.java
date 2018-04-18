package com.our.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.our.dao.AuthDAO;
import com.our.domain.UserDomain;
import com.our.repository.AuthRepository;

@Configuration
public class AuthDAOImpl implements AuthDAO {
	
	@Autowired
	private AuthRepository authRepository;
	
	@Override
	public boolean findUser(String userName, String password){
		boolean status = false;
		List<UserDomain> userDomainList = authRepository.findByUserName(userName);
		if(!userDomainList.isEmpty()) {
 			if(!authRepository.findByPassword(password).isEmpty()) {
 				status = true;
			}
		}
		return status;
	}

	@Override
	public UserDomain create(UserDomain userDomain) {
		return authRepository.save(userDomain);
	}
}
