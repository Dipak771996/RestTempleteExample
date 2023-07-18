package com.BikkadIT.Response;

import java.util.List;

public class User {

	private String name;
	private List<Country> country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Country> getCountry() {
		return country;
	}
	public void setCountries(List<Country> country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", countries=" + country + "]";
	}
	
	
}
