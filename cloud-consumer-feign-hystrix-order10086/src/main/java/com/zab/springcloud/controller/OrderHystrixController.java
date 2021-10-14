package com.zab.springcloud.controller;

import com.zab.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixController {
	
	@Resource
	private PaymentHystrixService paymentHystrixService;
	
	@GetMapping("/consumer/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentHystrixService.paymentInfo_OK(id);
		return result;
	}
	
	public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
		String result = paymentHystrixService.paymentInfo_TimeOut(id);
		return result;
	}
	
	

}
