package com.example.kafka_simple.controller;


import com.example.kafka_simple.Notification.Notification;
import com.example.kafka_simple.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
@Slf4j
public class NotificationController {

    private final KafkaProducer kafkaProducer;

    @PostMapping
    public ResponseEntity<String> sendNotification(@RequestBody Notification notification) {
        log.info("Received notification request: {}", notification);
        kafkaProducer.sendNotification(notification);
        return ResponseEntity.ok("Notification sent successfully!");
    }
}