package com.waseem.demo.entity;

import com.waseem.demo.masermodel.LogLevelDetail;
import com.waseem.demo.model.Constants;
import java.util.List;
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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collation = Constants.USER_INFO)
public class UserInfo extends BaseEntity {


  @Field(name = Constants.NAME)
  private String name;

  @Field(name = Constants.EMAIL)
  private String email;

  @Field(name = Constants.PHONE)
  private String phone;

  @Field(name = Constants.LOG_LEVEL)
  private List<LogLevelDetail> logLevelDetails;
}
