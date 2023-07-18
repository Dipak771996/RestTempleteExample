package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Response.Flight;
import com.BikkadIT.service.ServiceImpl;

@RestController
public class FlightController {

	@Autowired
	private ServiceImpl serviceImpl;
	
	@GetMapping(value = "/getFlights",produces = "application/json")
	public ResponseEntity<List<Flight>> getFlightsData()
	{
		List<Flight> data = serviceImpl.getData();
		return new ResponseEntity<List<Flight>>(data,HttpStatus.ACCEPTED);
	}
}
