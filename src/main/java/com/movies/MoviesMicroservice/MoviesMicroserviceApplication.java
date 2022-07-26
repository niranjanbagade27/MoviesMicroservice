package com.movies.MoviesMicroservice;

import com.movies.resource.MoviesResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = "com.movies")
public class MoviesMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesMicroserviceApplication.class, args);
	}

}
