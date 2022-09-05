package com.example.backend.controller;

import com.example.backend.model.Progress;
import com.example.backend.service.ProgressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/progress")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://sigma-plus-frontend.herokuapp.com")
public class ProgressController {
    private final ProgressService progressService;

    public ProgressController(ProgressService progressService) {
        this.progressService = progressService;
    }

    @GetMapping
    public List<Progress> getAllForUser(@RequestHeader("user-id") Long userId) {
        return progressService.getAllForUser(userId);
    }

    @GetMapping("/{topicId}")
    public Progress getProgressForTopicForUser(@RequestHeader("user-id") Long userId, @PathVariable Long topicId) {
        return progressService.getProgressForTopicForUser(topicId, userId);
    }

    @PostMapping("/{topicId}")
    public Progress createProgressForTopicForUser(@RequestHeader("user-id") Long userId, @PathVariable Long topicId) {
        return progressService.createProgressForTopicForUser(topicId, userId);
    }

    @PostMapping("/{topicId}/open/{problemIdx}")
    public Progress openProblemForTopicForUser(
            @RequestHeader("user-id") Long userId,
            @PathVariable Long topicId,
            @PathVariable Integer problemIdx) {
        return progressService.openProblemForTopicForUser(topicId, userId, problemIdx);
    }

    @PostMapping("/{topicId}/solve/{problemIdx}")
    public Progress solveProblemForTopicForUser(
            @RequestHeader("user-id") Long userId,
            @PathVariable Long topicId,
            @PathVariable Integer problemIdx) {
        return progressService.solveProblemForTopicForUser(topicId, userId, problemIdx);
    }
}
