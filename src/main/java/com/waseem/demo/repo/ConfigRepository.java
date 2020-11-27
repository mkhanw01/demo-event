package com.waseem.demo.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.waseem.demo.entity.Config;

/**
 * @author waseem.khan since 27/11/20.
 */

public interface ConfigRepository extends MongoRepository<Config, ObjectId> {

  Config findByLogLevel_Log(String logLevel);
}
