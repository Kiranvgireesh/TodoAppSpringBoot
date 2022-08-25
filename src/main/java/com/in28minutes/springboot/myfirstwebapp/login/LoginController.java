package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	private AuthentificationService authentificationservice;
	
	
	
	
	public LoginController(AuthentificationService authentificationservice) {
		super();
		this.authentificationservice = authentificationservice;
	}

	@RequestMapping(value="login",method= RequestMethod.GET)
	public String gotologinpage() {
		return "login" ;
		
	}
	
	@RequestMapping(value="login",method= RequestMethod.POST)
	public String gotoWelcomepage(@RequestParam String name ,@RequestParam String password,ModelMap map) {
		
		if(authentificationservice.authenticator(name, password)) {
		
		map.put("name", name);
		return "welcome";
		}
		map.put("errorMessage", "Invalid Credentials provided please try again!!!!");
		return "login";
		
	}


}
