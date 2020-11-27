package com.waseem.demo.entity;

import com.waseem.demo.model.Constants;
import java.util.Date;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author waseem.khan since 27/11/20.
 */
@Data
public class BaseEntity {

  @Id
  @Field(value = Constants.ID)
  private ObjectId id;

  @CreatedDate
  @Field(value = Constants.CREATED_DATE)
  private Date createdDate;

  @CreatedBy
  @Field(value = Constants.CREATED_BY)
  private String createdBy;

  @LastModifiedDate
  @Field(value = Constants.UPDATED_DATE)
  private Date updatedDate;

  @LastModifiedBy
  @Field(value = Constants.UPDATED_BY)
  private String updatedBy;

  @Version
  @Field(value = Constants.VERSION)
  private Long version;
}
