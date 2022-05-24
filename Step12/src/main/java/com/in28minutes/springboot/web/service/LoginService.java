package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// in28minutes, dummy
		System.out.println("---------3");
		System.out.println("userid: " + userid);
		System.out.println("password: " + password);
		return userid.equalsIgnoreCase("hee")
				&& password.equalsIgnoreCase("pwd");
	}

}
