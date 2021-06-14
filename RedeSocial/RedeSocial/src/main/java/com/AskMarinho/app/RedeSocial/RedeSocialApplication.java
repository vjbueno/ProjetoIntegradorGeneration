package com.AskMarinho.app.RedeSocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedeSocialApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(RedeSocialApplication.class, args);
	}

}
