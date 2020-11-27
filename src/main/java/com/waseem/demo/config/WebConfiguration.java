package com.waseem.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author waseem.khan since 27/11/20.
 */

@Configuration
public class WebConfiguration implements WebMvcConfigurer  {

  @Bean
  public static PropertySourcesPlaceholderConfigurer sourcesPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/docs/**").addResourceLocations("classpath:/META-INF/resources/");
  }

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addRedirectViewController("/docs/v2/api-docs", "/v2/api-docs");
    registry.addRedirectViewController("/docs/swagger-resources", "/swagger-resources");
    registry.addRedirectViewController("/docs/swagger-resources/configuration/ui",
        "/swagger-resources/configuration/ui");
    registry.addRedirectViewController("/docs/swagger-resources/configuration/security",
        "/swagger-resources/configuration/security");
    registry.addRedirectViewController("/docs", "/docs/swagger-ui.html");
  }
}
