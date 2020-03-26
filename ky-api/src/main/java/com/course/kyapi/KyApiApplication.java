package com.course.kyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.course")
public class KyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyApiApplication.class, args);
	}

}
