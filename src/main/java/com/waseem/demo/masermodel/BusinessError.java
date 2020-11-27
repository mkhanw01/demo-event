package com.waseem.demo.masermodel;

/**
 * @author waseem.khan since 27/11/20.
 */
public enum  BusinessError {

  SYSTEM_ERROR("Internal system error"),
  INVALID_REQUEST("Request is invalid");

  private String message;

  BusinessError(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public String getCode() {
    return this.name();
  }
}
