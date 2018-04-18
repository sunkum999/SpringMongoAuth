package com.our.service;

import com.our.domain.UserDomain;

public interface AuthService {
	
	public boolean getAsuthrized(String userName, String password);
	
	public UserDomain createUser(UserDomain userDomain);

}
