package com.example.backend.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Topic {
    Long id;
    String title;
    String description;
    String imgName;
    List<Problem> problems;
    List<Video> videos;

    public Topic( String title, String description, String imgName, List<Problem> problems, List<Video> videos) {
        this.id = (long)(Math.random()*1000);
        this.title = title;
        this.description = description;
        this.imgName = imgName;
        this.problems = problems;
        this.videos = videos;
    }
}
