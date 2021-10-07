package com.zab.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付模块实体类
 *
 * @author <1254087415@qq.com>
 * @since 2021/9/28 22:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	private Long id;
	
	private String serial;
	
}
