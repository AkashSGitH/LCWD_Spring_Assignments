package com.core.assignment2.service;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationServiceImpl implements INotificationService {

    public SmsNotificationServiceImpl() {
        System.out.println("SmsNotificationServiceImpl Constructor");
    }

    @Override
    public void pushNotification(String msg) {
        System.out.println("sending SMS Notification: " + msg);
    }
}
