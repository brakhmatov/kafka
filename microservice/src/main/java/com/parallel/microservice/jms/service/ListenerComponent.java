package com.parallel.microservice.jms.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ListenerComponent {
	
	@JmsListener(destination = "DEV.QUEUE.1", containerFactory = "myFactory")
	public void receiveMessage(String transaction) {
		log.info(transaction);
	}
}
