package com.course.kyadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.course")
public class KyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyAdminApplication.class, args);
	}

}
