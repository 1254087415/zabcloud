package com.zab.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain10086 {
	public static void main(String[] args) {
		SpringApplication.run(OrderFeignMain10086.class, args);
	}
}
