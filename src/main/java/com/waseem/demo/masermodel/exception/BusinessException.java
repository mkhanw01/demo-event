package com.waseem.demo.masermodel.exception;

import com.waseem.demo.masermodel.BusinessError;

/**
 * @author waseem.khan since 27/11/20.
 */
public class BusinessException extends RuntimeException {
  private final BusinessError error;
  private final String errorMessage;

  public BusinessException(BusinessError errorCode) {
    this.error = errorCode;
    this.errorMessage = errorCode.getMessage();
  }

  public BusinessException(BusinessError errorCode, String errorMessage) {
    this.error = errorCode;
    StringBuilder finalErrorMessage = new StringBuilder();
    finalErrorMessage.append(error.getMessage());
    finalErrorMessage.append(errorMessage);
    this.errorMessage = finalErrorMessage.toString();
  }

  public String getCode() {
    return this.error.getCode();
  }

  @Override
  public String getMessage() {
    return this.errorMessage;
  }
}
