package com.zab.springcloud.service;

import com.zab.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
	
	/**
	 * 新建支付
	 *
	 * @param payment 支付
	 * @return java.lang.Integer
	 * @author <1254087415@qq.com>
	 * @since 2021/9/28 23:37
	 */
	Integer create(Payment payment);
	
	/**
	 * 查询支付
	 *
	 * @param id 主键
	 * @return com.zab.springcloud.entitles.Payment
	 * @author <1254087415@qq.com>
	 * @since 2021/9/28 23:38
	 */
	Payment getPaymentById(@Param("id") Long id);
}
