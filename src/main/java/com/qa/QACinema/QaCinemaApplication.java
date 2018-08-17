package com.qa.QACinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.qa.QACinema.repository")
@SpringBootApplication
public class QaCinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QaCinemaApplication.class, args);
	}
}
