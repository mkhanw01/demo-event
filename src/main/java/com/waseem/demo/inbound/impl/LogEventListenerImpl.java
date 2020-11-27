package com.waseem.demo.inbound.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.waseem.demo.inbound.LogEventListener;
import com.waseem.demo.masermodel.LogEvent;
import com.waseem.demo.model.Constants;
import com.waseem.demo.service.NotificationConsumerService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author waseem.khan since 27/11/20.
 */
@Component
@Slf4j
@KafkaListener(topics = Constants.LOG_TOPIC, containerFactory = "containerFactory")
public class LogEventListenerImpl implements LogEventListener {

  @Autowired
  private NotificationConsumerService notificationConsumerService;

  @Override
  @KafkaHandler
  public void consumeLog(LogEvent logEvent) throws Exception {
    log.info("#LogEventListenerImpl:- consume logEvent: {}", logEvent);
    notificationConsumerService.logNotification(logEvent);
  }
}
