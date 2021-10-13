package com.zab.springcloud.controller;

import com.zab.springcloud.entities.CommonResult;
import com.zab.springcloud.entities.Payment;
import com.zab.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
	
	@Resource
	private PaymentService paymentService;
	
	@Value("${server.port}")
	private String serverPort;
	
	@PostMapping("payment/create")
	public CommonResult<Payment> create(@RequestBody Payment payment) {
		Integer result = paymentService.create(payment);
		
		if (result > 0) {
			log.info("添加了" + result);
			return new CommonResult(200, "添加成功 + 端口号：" + serverPort, result);
		}
		return new CommonResult(400, "添加失败", null);
	}
	
	@GetMapping("payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		log.info("查询内容:" + payment + "哈哈哈辣鸡");
		if (payment != null) {
			return new CommonResult(200, "查询成功 + 端口号：" + serverPort, payment);
		}
		return new CommonResult(400, "查询失败", null);
	}
	
	@GetMapping("/payment/lb")
	public String getPaymentLB() {
		return serverPort;
	}
	
	
}
