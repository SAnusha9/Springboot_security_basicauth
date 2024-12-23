package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
@Value("$(message)")
	// get method to return a Customer
	@GetMapping("/customer")
	Customer get() {
		return new Customer(1, "Anusha S", "anusha@gmail.com");

	}

}
