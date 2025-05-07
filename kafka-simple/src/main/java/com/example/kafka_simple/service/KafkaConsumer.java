package com.example.kafka_simple.service;

import com.example.kafka_simple.Notification.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "notifications", groupId = "notification-group")
    public void listen(Notification notification){
        log.info("Received notification : {}",notification);
    }

}

