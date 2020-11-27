package com.waseem.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.waseem.demo.model.Constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author waseem.khan since 27/11/20.
 */
@EqualsAndHashCode(callSuper = true)
@Document(collation = Constants.CONFIG)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Config extends BaseEntity {

  @Field(value = Constants.LOG_LEVEL)
  private LogLevel logLevel;

  @Field(value = Constants.FREQUENCY)
  private int frequency;

  @Field(value = Constants.DURATION)
  private int duration;

  @Field(value = Constants.WAIT_TIME)
  private int waitTime;
}
