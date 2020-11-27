package com.waseem.demo.outbound;

/**
 * @author waseem.khan since 27/11/20.
 */
public interface NotificationService {
  void sendSms(String smsBody);
  void sendEmail(String emailBody);
  void callUsers(String userPhone);
}
