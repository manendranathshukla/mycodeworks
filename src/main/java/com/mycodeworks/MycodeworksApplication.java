package com.mycodeworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MycodeworksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycodeworksApplication.class, args);
	}

}
