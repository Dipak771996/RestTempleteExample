package com.BikkadIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Response.User;
import com.BikkadIT.service.ServiceImpl;

@RestController
public class UserController {

	@Autowired
	private ServiceImpl serviceImpl;
	
	@GetMapping(value = "/getUser",produces = "application/json")
	public ResponseEntity<User> getUserData()
	{
		User user = serviceImpl.getUserData();
		return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
	}
}
