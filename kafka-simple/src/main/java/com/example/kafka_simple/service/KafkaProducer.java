package com.example.kafka_simple.service;

import com.example.kafka_simple.Notification.Notification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {
   private static final String TOPIC = "notifications";

   private final KafkaTemplate<String , Notification> kafkaTemplate;

   public void sendNotification(Notification notification){
       log.info("sending Notification: {}",notification);
       kafkaTemplate.send(TOPIC,notification);
       log.info("Notifcation sent successfully");
   }
}
