package com.waseem.demo.masermodel;

/**
 * @author waseem.khan since 27/11/20.
 */
public enum LogLevelDetail {
  INFO("INFO", 50, 200, 200, true),
  WARNING("WARNING", 20,150,150,true),
  CRITICAL("CRITICAL",10,100,100,true),
  BLOCKER("BLOCKER", 5,50,50,true);

  private String logName;
  private int frequency;
  private int duration;
  private int waitTime;
  private boolean enable;

  LogLevelDetail(String logName, int frequency, int duration, int waitTime, boolean enable) {
    this.logName = logName;
    this.frequency = frequency;
    this.duration = duration;
    this.waitTime = waitTime;
    this.enable = enable;
  }

  public String getLogName() {
    return logName;
  }

  public int getFrequency() {
    return frequency;
  }

  public int getDuration() {
    return duration;
  }

  public int getWaitTime() {
    return waitTime;
  }

  public boolean isEnable() {
    return enable;
  }
}
