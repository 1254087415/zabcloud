package com.zab.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author <1254087415@qq.com>
 * @since 2021/9/28 0:09
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8002.class, args);
	}
}
