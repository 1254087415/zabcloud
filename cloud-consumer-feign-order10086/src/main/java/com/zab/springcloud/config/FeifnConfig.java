package com.zab.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeifnConfig {
	
	Logger.Level feginLoggerLevel() {
		return Logger.Level.FULL;
	}
}
