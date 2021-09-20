package com.parallel.microservice.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ConsumerComponent {

	@KafkaListener(topics = "parallel-output-topic", groupId = "parallel-output-group-2")
	public void listner(String data) {
		log.info(data);
	}
}
