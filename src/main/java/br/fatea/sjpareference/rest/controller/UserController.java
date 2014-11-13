package br.fatea.sjpareference.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {

	@RequestMapping(method=RequestMethod.GET)
	public String list(){
		
		return "users/list";
	}
	
}
