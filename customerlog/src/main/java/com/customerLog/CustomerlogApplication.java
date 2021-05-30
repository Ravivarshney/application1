package com.customerLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.customerLog")
public class CustomerlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerlogApplication.class, args);
	}

}
