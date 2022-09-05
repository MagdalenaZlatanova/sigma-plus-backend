package com.example.backend.model;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Progress {
    Long topicId;
    Long userId;
    Map<Integer, Boolean> openedProblems;
    Map<Integer, Boolean> solvedProblems;

    public Progress(Long topicId, Long userId) {
        this.topicId = topicId;
        this.userId = userId;
        openedProblems = new HashMap<>();
        solvedProblems = new HashMap<>();
    }

    public void openProblem(int problemIdx) {
        openedProblems.put(problemIdx, true);
    }

    public void solveProblem(int problemIdx) {
        solvedProblems.put(problemIdx, true);
    }
}
