package com.example.backend.service.implementation;

import com.example.backend.model.Progress;
import com.example.backend.repository.InMemoryProgressRepository;
import com.example.backend.service.ProgressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressServiceImpl implements ProgressService {
    private final InMemoryProgressRepository repository;

    public ProgressServiceImpl(InMemoryProgressRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Progress> getAllForUser(Long userId) {
        return repository.getAllForUser(userId);
    }

    @Override
    public Progress getProgressForTopicForUser(Long topicId, Long userId) {
        return repository.getProgressForTopicForUser(topicId, userId);
    }

    @Override
    public Progress createProgressForTopicForUser(Long topicId, Long userId) {
        return repository.newProgressForTopicForUser(topicId, userId);
    }

    @Override
    public Progress openProblemForTopicForUser(Long topicId, Long userId, int problemIdx) {
        Progress progress = repository.getProgressForTopicForUser(topicId, userId);
        progress.openProblem(problemIdx);
        return progress;
    }

    @Override
    public Progress solveProblemForTopicForUser(Long topicId, Long userId, int problemIdx) {
        Progress progress = repository.getProgressForTopicForUser(topicId, userId);
        progress.solveProblem(problemIdx);
        return progress;
    }
}
