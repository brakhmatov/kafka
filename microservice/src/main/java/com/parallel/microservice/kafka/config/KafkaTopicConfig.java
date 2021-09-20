package com.parallel.microservice.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaTopicConfig {

	@Value(value = "${kafka.bootstrap.servers:localhost:9092}")
	private String bootstrapServers;
	
	@Bean
	public NewTopic topicInput() {
		return TopicBuilder.name("parallel-input-topic")
				.partitions(6)
				.replicas(1)
				.build();
	}

	@Bean
	public NewTopic topicOutput() {
		return TopicBuilder.name("parallel-output-topic")
				.partitions(6)
				.replicas(1)
				.build();
	}
	
	@Bean
	public KafkaAdmin kafkaAdmin() {
		Map<String, Object> configurations = new HashMap<>();
		configurations.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9093");
		return new KafkaAdmin(configurations);
	}
}
