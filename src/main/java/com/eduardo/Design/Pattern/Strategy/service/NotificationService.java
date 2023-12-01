package com.eduardo.Design.Pattern.Strategy.service;

import com.eduardo.Design.Pattern.Strategy.service.strategy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class NotificationService {

    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
            "discord", new DiscordNotificationStrategy(),
            "instagram", new InstagramNotificationStrategy(),
            "x", new XNotificationStrategy(),
            "whatsapp", new WhatsappNotificationStrategy(),
            "email", new EmailNotificationStrategy()
    );

    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void notify(String channel, String destination, String message) {

        mapStrategy.get(channel).sendNotification(destination, message);
    }
}
