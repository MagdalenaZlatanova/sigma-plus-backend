package com.example.backend.repository;

import com.example.backend.model.Problem;
import com.example.backend.model.Progress;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InMemoryProgressRepository {
    private List<Progress> progressList;

    @PostConstruct
    public void init() {
        progressList = new ArrayList<>();
    }

    public List<Progress> getAllForUser(Long userId) {
        return progressList.stream()
                .filter(progress -> progress.getUserId().equals(userId))
                .collect(Collectors.toList());
    }

    public Progress getProgressForTopicForUser(Long topicId, Long userId) {
        return progressList.stream()
                .filter(progress -> progress.getUserId().equals(userId) && progress.getTopicId().equals(topicId))
                .findFirst().orElse(null);
    }

    public Progress newProgressForTopicForUser(Long topicId, Long userId) {
        Progress progress = progressList.stream()
                .filter(p -> p.getTopicId().equals(topicId) && p.getUserId().equals(userId))
                .findFirst().orElse(null);
        if (progress != null)
            return progress;

        progress = new Progress(topicId, userId);
        progressList.add(progress);
        return progress;
    }
}
