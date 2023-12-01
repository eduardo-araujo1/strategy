package com.eduardo.Design.Pattern.Strategy.service;

public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}
