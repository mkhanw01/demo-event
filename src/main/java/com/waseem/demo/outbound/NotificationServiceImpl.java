package com.waseem.demo.outbound;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author waseem.khan since 27/11/20.
 */
@Slf4j
@Service
public class NotificationServiceImpl implements NotificationService {

  @Override
  public void sendSms(String smsBody) {
    // TODO: 27/11/20  send a sms to user
  }

  @Override
  public void sendEmail(String emailBody) {
    // TODO: 27/11/20  send an email
  }

  @Override
  public void callUsers(String userPhone) {
    // TODO: 27/11/20 make a call to user
  }
}
