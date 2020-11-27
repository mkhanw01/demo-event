package com.waseem.demo.config;

import java.util.Optional;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;


/**
 * @author waseem.khan since 27/11/20.
 */

@Configuration
@EnableMongoAuditing
public class ServiceConfiguration {

  @Bean
  public Mapper createDozerMapper() {
    return new DozerBeanMapper();
  }

  @Bean
  public AuditorAware<String> userAuditorAware() {
    return () -> Optional.of("system");
  }
}
