package com.example.backend.model.dto;

import lombok.Getter;

@Getter
public class UserDto {
    Long userId;
    String username;

    public UserDto(Long userId, String username) {
        this.userId = userId;
        this.username = username;
    }
}
