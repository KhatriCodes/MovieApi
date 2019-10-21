package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.example.controller.MovieApiController;

@SpringBootApplication
@ComponentScan(basePackageClasses=MovieApiController.class)
public class MovieApiApplication {
	
	@Bean
	public RestTemplate getRestTeamplate()
	{
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args);
	}

}
	