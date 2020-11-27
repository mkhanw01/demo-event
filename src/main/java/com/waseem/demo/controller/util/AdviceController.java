/*
 *
 * Copyright (C) 2018 PT Global Digital Niaga - All Rights Reserved
 *
 * NOTICE:  All information contained herein is, and remains the property of PT Global Digital Niaga.
 *
 * Dissemination of this information or reproduction of this material is strictly forbidden.
 *
 */

package com.waseem.demo.controller.util;

import com.waseem.demo.masermodel.exception.BusinessException;
import com.waseem.demo.model.RestResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

/**
 * @author waseem.khan since 27/11/20.
 */
@RestControllerAdvice
@Slf4j
public class AdviceController {

  @ExceptionHandler(Throwable.class)
  RestResponse<Object> throwable(Throwable e) {
    log.error(e.getClass().getName(), e);
    return RestResponse.builder().errorCode(e.getClass().getName()).errorMessage(e.getMessage())
        .success(false).build();
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  RestResponse<Object> methodArgumentNotValidException(MethodArgumentNotValidException manve) {
    log.error(manve.getClass().getName(), manve.getBindingResult());
    StringBuilder msg = new StringBuilder("[");
    manve.getBindingResult().getAllErrors()
        .forEach(x -> msg.append(x.getDefaultMessage()).append(", "));
    return RestResponse.builder().errorCode(manve.getClass().getName())
        .errorMessage(msg.append(']').toString()).success(false).build();
  }

  @ExceptionHandler(BusinessException.class)
  RestResponse<Object> illegalArgumentException(BusinessException be) {
    log.error(be.getClass().getName(), be);
    return RestResponse.builder().errorCode(be.getCode()).errorMessage(be.getMessage())
        .success(false).build();
  }
}
