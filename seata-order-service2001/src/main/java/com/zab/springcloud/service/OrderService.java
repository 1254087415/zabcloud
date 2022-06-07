package com.zab.springcloud.service;

import com.zab.springcloud.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     *
     * @param order 订单数据
     */
    void create(Order order);
}
