package com.kajanan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.kajanan")
public class SpringSecurtitySts2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurtitySts2Application.class, args);
	}

}
