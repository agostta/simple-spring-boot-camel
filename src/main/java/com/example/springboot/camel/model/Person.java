package com.example.springboot.camel.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -8318612175218467352L;
	
	private int id;
	private String name, country;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
