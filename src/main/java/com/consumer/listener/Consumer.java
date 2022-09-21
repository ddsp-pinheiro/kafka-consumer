package com.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "${spring.topic.producer}", groupId = "group_id")
    public void consumer(String message) throws IOException{
        logger.info(String.format("### -> Consumed message -> %s", message));
    }
}
