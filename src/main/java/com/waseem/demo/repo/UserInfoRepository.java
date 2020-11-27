package com.waseem.demo.repo;

import com.waseem.demo.entity.UserInfo;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author waseem.khan since 27/11/20.
 */
public interface UserInfoRepository extends MongoRepository<UserInfo, ObjectId> {

}
