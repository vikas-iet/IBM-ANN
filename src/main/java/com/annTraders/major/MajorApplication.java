package com.annTraders.major;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class MajorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajorApplication.class, args);
	}


	@GetMapping("/admin")
	public String adminHome(){
		return "adminHome";
	}
}
