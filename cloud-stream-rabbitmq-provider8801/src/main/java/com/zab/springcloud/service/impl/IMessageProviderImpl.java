package com.zab.springcloud.service.impl;

import com.zab.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;


@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {
	
	@Resource
	private MessageChannel output; // 消息发送管道
	
	@Override
	public String send() {
		String serial = UUID.randomUUID().toString();
		output.send(MessageBuilder.withPayload(serial).build());
		System.out.println("*****serial: "+serial);
		return null;
	}
}
