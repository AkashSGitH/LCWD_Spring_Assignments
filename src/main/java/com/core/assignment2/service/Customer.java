package com.core.assignment2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Autowired
    @Qualifier("smsNotificationServiceImpl")
    private INotificationService notificationService;

    public void purchaseItems() {
        System.out.println("Purchasing items, sending notifications");
        notificationService.pushNotification("Item Purchased, will be delivered tomorrow");
    }

}
