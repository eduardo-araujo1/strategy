package com.eduardo.Design.Pattern.Strategy.controller;

import jakarta.validation.constraints.NotBlank;

public record NotificationRequest(
        @NotBlank
        String channel,
        @NotBlank
        String destination,
        @NotBlank
        String message
) {
}
