package com.kajanan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.kajanan")
@EntityScan(basePackages = "com.kajanan.model")
@EnableJpaRepositories(basePackages = "com.kajanan.repository")
public class SpringSecurtitySts2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurtitySts2Application.class, args);
	}

}
