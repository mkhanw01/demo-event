package com.waseem.demo.service.impl;

import com.waseem.demo.service.UtilityService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author waseem.khan since 27/11/20.
 */
@Service
@Slf4j
public class UtilityServiceImpl implements UtilityService {

  @Autowired
  private Mapper mapper;

  @Override
  public <M, T> T convert(M entity, Class<T> clasz) throws Exception {
    return null;
  }

  @Override
  public <M, T> List<T> convert(List<M> entities, Class<T> clasz) throws Exception {
    return null;
  }
}
