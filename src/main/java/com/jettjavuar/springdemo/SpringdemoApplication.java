package com.jettjavuar.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		SpringApplication.run(SpringdemoApplication.class, args);
	}

}
