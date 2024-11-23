package com.core.assignment2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationServiceImpl implements INotificationService {

    public EmailNotificationServiceImpl() {
        System.out.println("EmailNotificationServiceImpl Constructor");
    }

    @Override
    public void pushNotification(String msg) {
        System.out.println("Sending Email Notification : " + msg);
    }
}
