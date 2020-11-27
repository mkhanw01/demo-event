package com.waseem.demo.entity;

import com.waseem.demo.model.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author waseem.khan since 27/11/20.
 */
@EqualsAndHashCode(callSuper = true)
@Document(value = Constants.LOG_LEVEL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogLevel extends BaseEntity{

  @Field(value = Constants.LOG)
  private String log;
}
