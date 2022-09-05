package com.example.backend.controller;

import com.example.backend.model.Topic;
import com.example.backend.service.TopicService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/topic")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://sigma-plus-frontend.herokuapp.com")
public class TopicController {

    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public List<Topic> getAll() {
        return topicService.getAll();
    }

}
