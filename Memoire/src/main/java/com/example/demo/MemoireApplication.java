package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "Controller")
public class MemoireApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoireApplication.class, args);
	}

}
