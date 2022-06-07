package com.zab.springcloud.controller;

import com.zab.springcloud.domain.CommonResult;
import com.zab.springcloud.domain.Order;
import com.zab.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult<String> create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功", null);
    }
}
