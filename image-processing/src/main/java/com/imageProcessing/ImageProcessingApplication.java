package com.imageProcessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ImageProcessingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ImageProcessingApplication.class, args);
	}
}
