package com.example.backend.model;

import lombok.Getter;

@Getter
public class Video {
    String description;
    String url;

    public Video(String description, String url) {
        this.description = description;
        this.url = url;
    }
}
