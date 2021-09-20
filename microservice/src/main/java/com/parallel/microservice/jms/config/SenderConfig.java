package com.parallel.microservice.jms.config;

import javax.jms.JMSException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.mq.jms.MQConnectionFactory;
import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnection;
import com.ibm.mq.jms.MQQueueConnectionFactory;

@Configuration
public class SenderConfig {

//	@Bean
//	public MQConnectionFactory connectionFactory() throws JMSException {
//		MQConnectionFactory connectionFactory = new MQConnectionFactory();
//		connectionFactory.setChannel("DEV.ADMIN.SVRCONN");
//		
//		
//		return connectionFactory();
//	}
}
