package com.sistemaTodo.scrum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
@EntityScan(basePackages= "com.sistemaTodo.srum.entities")
@SpringBootApplication
public class SistemaToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaToDoApplication.class, args);
	}

}
