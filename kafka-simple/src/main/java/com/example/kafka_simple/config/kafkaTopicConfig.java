package com.example.kafka_simple.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Slf4j
public class kafkaTopicConfig {
    public NewTopic NotificationTopic(){
        log.info("creating notification topic ");
        return TopicBuilder.name("notification")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
