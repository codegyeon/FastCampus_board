package com.example.fastcampusboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastCampusBoardApplication.class, args);
	}

}
