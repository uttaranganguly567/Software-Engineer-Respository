package com.uttaran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UttaranApplication {

	public static void main(String[] args) {
		SpringApplication.run(UttaranApplication.class, args);
	}

//	@GetMapping
	public String helloWorld(){
		return "Hello World Spring Boot";
	}

}
