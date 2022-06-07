package com.zab.springcloud.dao;

import com.zab.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {
    /**
     * 创建订单
     *
     * @param order 订单数据
     */
    void create(Order order);

    /**
     * 修改订单状态为完成
     * @param userId 用户id
     * @param status 状态
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
