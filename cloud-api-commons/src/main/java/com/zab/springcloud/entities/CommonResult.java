package com.zab.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回封装实体类
 *
 * @author <1254087415@qq.com>
 * @since 2021/9/28 23:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
	
	private Integer code;
	
	private String msg;
	
	private T data;
	
	public CommonResult(Integer code, String msg) {
		this(code, msg, null);
	}
}
