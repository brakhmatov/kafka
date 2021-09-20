package com.parallel.microservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
@ConfigurationProperties("basic")
public class Config {
	
	private String message;
}
