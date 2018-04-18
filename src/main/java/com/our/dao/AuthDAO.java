package com.our.dao;

import com.our.domain.UserDomain;

public interface AuthDAO {
	
	public boolean findUser(String userName, String password);
	
	public UserDomain create(UserDomain userDomain);
	
}
