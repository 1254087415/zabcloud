package com.zab.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderHystrixMain10086 {
	public static void main(String[] args) {
		SpringApplication.run(OrderHystrixMain10086.class, args);
	}
}
