package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringRunApplication {
    
	public static void main(String[] args) {
		
		SpringApplication.run(SpringRunApplication.class, args);
		
	}
	
}
