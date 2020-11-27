package com.waseem.demo.service;

import java.util.List;

/**
 * @author waseem.khan since 27/11/20.
 */
public interface UtilityService {
  /**
   * @param entity source object to be converted
   * @param clasz destination class
   * @param <M> entity
   * @param <T> clasz
   * @return converted object
   * @throws Exception exception
   */
  <M, T> T convert(M entity, Class<T> clasz) throws Exception;

  /**
   * @param entities list of source object to be converted
   * @param clasz destination class
   * @param <M> entities
   * @param <T> clasz
   * @return converted list of objcet
   * @throws Exception exception
   */
  <M, T> List<T> convert(List<M> entities, Class<T> clasz) throws Exception;
}
