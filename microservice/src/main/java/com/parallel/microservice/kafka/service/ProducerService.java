package com.parallel.microservice.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProducerService {

	@Value("${kafka.output.topic:parallel-output-topic}")
	private String outputTopic;	
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void send(String message) {
		log.debug("Message: {}", message);
		this.kafkaTemplate.send(this.outputTopic, message);
	}
}
