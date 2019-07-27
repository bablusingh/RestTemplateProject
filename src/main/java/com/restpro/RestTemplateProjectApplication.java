package com.restpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.experimental.PackagePrivate;

@SpringBootApplication
@ComponentScan(basePackages = "com.restpro")
public class RestTemplateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateProjectApplication.class, args);
	}

}
