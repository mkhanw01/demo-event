package com.waseem.demo.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.waseem.demo.masermodel.LogEvent;
import com.waseem.demo.model.Constants;


/**
 * @author waseem.khan since 27/11/20.
 */

@EnableKafka
@Configuration
public class BasicConsumerConfig {

  @Value("${spring.kafka.bootstrap-servers}")
  private String servers;


  public ConsumerFactory<String, LogEvent> kafkaConsumerFactory() {
    Map<String, Object> props = new HashMap<>();
    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, servers);
    props.put(ConsumerConfig.GROUP_ID_CONFIG, Constants.LOG_TOPIC);
    return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(),
        new JsonDeserializer<>(LogEvent.class));
  }

  @Bean
  public ConcurrentKafkaListenerContainerFactory<String, LogEvent> containerFactory() {
    ConcurrentKafkaListenerContainerFactory<String, LogEvent> factory =
        new ConcurrentKafkaListenerContainerFactory<>();
    factory.setConsumerFactory(kafkaConsumerFactory());
    return factory;
  }

}
