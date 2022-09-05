package com.example.backend.service;

import com.example.backend.model.Progress;

import java.util.List;

public interface ProgressService {

    List<Progress> getAllForUser(Long userId);

    Progress getProgressForTopicForUser(Long topicId, Long userId);

    Progress createProgressForTopicForUser(Long topicId, Long userId);

    Progress openProblemForTopicForUser(Long topicId, Long userId, int problemIdx);

    Progress solveProblemForTopicForUser(Long topicId, Long userId, int problemIdx);

}
