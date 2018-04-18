package com.our.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.our.dao.AuthDAO;
import com.our.domain.UserDomain;
import com.our.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private AuthDAO authDAO;
	
	public boolean getAsuthrized(String userName, String password) {
		return authDAO.findUser(userName, password);
	}
	
	@Override
	public UserDomain createUser(UserDomain userDomain) {
		return authDAO.create(userDomain);
	}

}
