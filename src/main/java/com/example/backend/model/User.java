package com.example.backend.model;

import lombok.Getter;

@Getter
public class User {
    Long id;
    String username;
    String password;

    public User(String username, String password) {
        this.id = (long)(Math.random() * 1000);
        this.username = username;
        this.password = password;
    }
}
