package com.keytourist.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("login")
	ResponseEntity login(@RequestHeader String username,@RequestHeader String password){
		if(username.equals("Admin") && password.equals("123@abc")) {
			return new ResponseEntity("Present", HttpStatus.FOUND);
		}
		return new ResponseEntity("Present", HttpStatus.NOT_FOUND);
	}
}
