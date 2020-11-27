package com.waseem.demo.service;

import com.waseem.demo.masermodel.LogEvent;

/**
 * @author waseem.khan since 27/11/20.
 */
public interface NotificationConsumerService {

  /**
   * based on logType get the data from config repo and then check the frequency and based on that
   * decide to call the notification service to respected user , and update the config as well.
   *
   * @param logEvent object reference of {@link LogEvent}
   * @throws Exception through the exception and log those exception
   */
  void logNotification(LogEvent logEvent) throws Exception;
}
