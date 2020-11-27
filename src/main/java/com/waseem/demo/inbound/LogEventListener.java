package com.waseem.demo.inbound;

import com.waseem.demo.masermodel.LogEvent;

/**
 * @author waseem.khan since 27/11/20.
 */
public interface LogEventListener {

  /**
   * consume the log event
   * @param logEvent object reference of @{@link LogEvent}
   */
  void consumeLog(LogEvent logEvent) throws Exception;
}
