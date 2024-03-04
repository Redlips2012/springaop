package com.example.springAOPv2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springAOPv2.service.MyService;

@RestController
@RequestMapping("/")
public class MyController {

	@Autowired
	MyService myService;
	
	@GetMapping()
	public String PrintHello() {
		myService.CallMe();
		System.out.println("Hello");
		return "Hello";
	}
}
