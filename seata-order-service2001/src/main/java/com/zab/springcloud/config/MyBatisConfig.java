package com.zab.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.zab.springcloud.dao"})
public class MyBatisConfig {

}
