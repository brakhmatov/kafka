package com.parallel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ParallelConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParallelConfigApplication.class, args);
	}

}
