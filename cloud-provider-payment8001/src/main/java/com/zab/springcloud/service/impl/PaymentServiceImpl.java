package com.zab.springcloud.service.impl;

import com.zab.springcloud.dao.PaymentDao;
import com.zab.springcloud.entities.Payment;
import com.zab.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Resource
	private PaymentDao paymentDao;
	
	@Override
	public Integer create(Payment payment) {
		return paymentDao.create(payment);
	}
	
	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
	
}
