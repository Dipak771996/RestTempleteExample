package com.BikkadIT.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.BikkadIT.Response.Flight;
import com.BikkadIT.Response.Flights;
import com.BikkadIT.Response.User;

@Service
public class ServiceImpl {

	RestTemplate rt=new RestTemplate();
	
	public List<Flight> getData()
	{
		String url="http://mu.mulesoft-training.com/essentials/united/flights";
		
		
//		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
//		String string = responseEntity.getBody();
//		System.out.println(string);
		ResponseEntity<Flights> responseEntity = rt.getForEntity(url, Flights.class);
		Flights body = responseEntity.getBody();
		List<Flight> flights = body.getFlights();
		
		for(Flight f:flights)
		{
			System.out.println(f);
		}
		
		return flights;
	}
	
	public User getUserData()
	{
		String url="https://api.nationalize.io/?name=nathaniel";
		ResponseEntity<User> responseEntity = rt.getForEntity(url, User.class);
		User body = responseEntity.getBody();
		return body;
	}
}
