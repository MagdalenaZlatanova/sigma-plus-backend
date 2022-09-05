package com.example.backend.service.implementation;

import com.example.backend.model.Topic;
import com.example.backend.repository.InMemoryTopicRepository;
import com.example.backend.service.TopicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    private final InMemoryTopicRepository repository;

    public TopicServiceImpl(InMemoryTopicRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Topic> getAll() {
        return repository.getAll();
    }
}
