package com.example.backend.model.dto;

import lombok.Getter;

@Getter
public class StatusMessageDto {
    String message;

    public StatusMessageDto(String message) {
        this.message = message;
    }
}
