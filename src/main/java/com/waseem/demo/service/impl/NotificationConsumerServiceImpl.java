package com.waseem.demo.service.impl;

import com.waseem.demo.entity.Config;
import com.waseem.demo.masermodel.BusinessError;
import com.waseem.demo.masermodel.LogEvent;
import com.waseem.demo.masermodel.LogLevelDetail;
import com.waseem.demo.masermodel.exception.BusinessException;
import com.waseem.demo.outbound.NotificationService;
import com.waseem.demo.repo.ConfigRepository;
import com.waseem.demo.service.NotificationConsumerService;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author waseem.khan since 27/11/20.
 */
@Service
@Slf4j
public class NotificationConsumerServiceImpl implements NotificationConsumerService {

  @Autowired
  private ConfigRepository configRepository;

  @Autowired
  private NotificationService notificationService;

  @Override
  public void logNotification(LogEvent logEvent) throws Exception {

    if(Objects.isNull(logEvent) || Objects.isNull(logEvent.getLogLevelDetail())) {
      throw new BusinessException(BusinessError.INVALID_REQUEST, "log data corrupted");
    }
    Config config = this.configRepository.findByLogLevel_Log(logEvent.getLogLevelDetail().getLogName());
    Config updatedConfig= validateAndProcess(config, logEvent);
    this.configRepository.save(updatedConfig);
  }

  /**
   *  validate with synchronized and check whether we have to send or not
   *  this peace of code can be improved and can be apply the Factory pattern
   *  where we can implement based on logLevel and then put there synchronized bock as well.
   *  So it will avoid the others loglevel to block
   * @param config
   * @param logEvent
   */
  synchronized private Config validateAndProcess(Config config, LogEvent logEvent) {

    if(LogLevelDetail.INFO.equals(config.getLogLevel().getLog())){
      // TODO: 27/11/20  check with the info config and call to respective service
    } else if(LogLevelDetail.WARNING.getLogName().equals(config.getLogLevel().getLog())){
      // TODO: 27/11/20  check with warning config and based on user tagged send the notification
    } else if(LogLevelDetail.CRITICAL.getLogName().equals(config.getLogLevel().getLog())){
      // TODO: 27/11/20 check with critical threashold and send notification/call
    } else {
      // TODO: 27/11/20  check with blocker and call to nofification service
    }
    // TODO: 27/11/20  and the end update the config and return
    return config;
  }
}
