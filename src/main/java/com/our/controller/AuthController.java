package com.our.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.our.domain.UserDomain;
import com.our.service.AuthService;

@RestController
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping(path= "auth/login", params= {"userName", "password"}, produces="text/html")
	public String getAuth(String userName, String password) {
		System.out.println("Came True :: getAuth()");
		if(authService.getAsuthrized(userName, password)) {
			return "SUCCESS...!!!";
		} else {
			return "FAILED...!!!";
		}
	}
	
	@PostMapping(path="auth/createUser", params= {"id", "userName", "password"}, produces="text/html")
	public String createUser(String id, String userName, String password) {
		System.out.println("Came True :: createUser()");
		UserDomain userDomain = new UserDomain();
		userDomain.setId(Integer.parseInt(id));
		userDomain.setUserName(userName);
		userDomain.setPassword(password);
		
		userDomain = authService.createUser(userDomain);
		return "SUCCESS...!!!";
		
	}
}
