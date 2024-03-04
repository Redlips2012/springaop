package com.example.springAOPv2.model;

public class Employee {

	private String name="thinh";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void Print() {
		System.out.println("Hello");
	}
	
}
