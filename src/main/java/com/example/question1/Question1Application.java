package com.example.question1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class Question1Application {

	SupplyData supplyData = SupplyData.getInstance();
	public static void main(String[] args) {
		SpringApplication.run(Question1Application.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "Congratulations from BlogController.java";
	}
	@GetMapping("/Hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name){
		return String.format("Hello %s!", name);
	}
	@PostMapping("/updateSupply")
	public List<Supply> updateSupply(){
		return supplyData.fetchProducts();
	}

}
