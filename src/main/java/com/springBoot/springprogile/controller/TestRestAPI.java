package com.springBoot.springprogile.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@Profile("dev")
public class TestRestAPI {

	@PostConstruct
	public void TestRestAPI1(){
		System.out.println("Object constructed with Dev profile");
	}
	
}
