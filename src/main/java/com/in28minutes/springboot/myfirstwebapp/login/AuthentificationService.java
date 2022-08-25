package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthentificationService {
	
	
	public Boolean authenticator(String name, String password) {
	  boolean isValidUserName=name.equalsIgnoreCase("kiran");
	  boolean isValidPassword=password.equalsIgnoreCase("dummy");
	  
	  return isValidPassword && isValidUserName ;
	}
	
	

}
