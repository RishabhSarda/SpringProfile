package com.springBoot.springprogile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springBoot.springprogile.controller")
public class SpringProgileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProgileApplication.class, args);
	}

}
