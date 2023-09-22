package com.example.main;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String hello(Principal  p) {
		return "<h1> welcome </h1>"+p.getName()+p.toString();
	}
	
	@GetMapping("/user")
	public String hello1(Principal  p) {
		return "<h1> welcome user </h1>"+p.getName()+p.toString();
	}
	
	@GetMapping("/admin")
	public String hello2(Principal  p) {
		return "<h1> welcome admin </h1>"+p.getName()+p.toString();
	}
}
