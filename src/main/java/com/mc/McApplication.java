package com.mc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McApplication {

	public static void main(String[] args) {
		int x = 99;
		String name="sam";
		SpringApplication.run(McApplication.class, args);
	}

}
