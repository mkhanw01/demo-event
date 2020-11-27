package com.waseem.demo.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author waseem.khan since 27/11/20.
 */

@JsonInclude(Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestResponse<T> {

  private boolean success;
  private String errorCode;
  private String errorMessage;
  private T data;
  private Paging paging;
  private Map<String, List<String>> errors;

  public RestResponse(boolean success) {
    this.success = success;
  }

  public RestResponse(boolean success, T data) {
    this.success = success;
    this.data = data;
  }

  public RestResponse(boolean success, T data, Paging paging) {
    this.success = success;
    this.data = data;
    this.paging = paging;
  }

  public RestResponse(String errorCode, String errorMessage, boolean success, T data) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.success = success;
    this.data = data;
  }

  public RestResponse(String errorCode, String errorMessage, boolean success) {
    this.errorMessage = errorMessage;
    this.errorCode = errorCode;
    this.success = success;
  }
}
