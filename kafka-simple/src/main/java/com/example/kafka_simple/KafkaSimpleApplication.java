package com.example.kafka_simple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class KafkaSimpleApplication {

	public static void main(String[] args) {
		log.info("start Notification Service");
		SpringApplication.run(KafkaSimpleApplication.class, args);

	}

}
