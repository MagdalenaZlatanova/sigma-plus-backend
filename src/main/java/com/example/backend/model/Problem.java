package com.example.backend.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Problem {
    Long id;
    String question;
    List<String> possibleAnswers;
    int correctAnswer;

    public Problem(String question, List<String> possibleAnswers, int correctAnswer) {
        this.id = (long)(Math.random()*1000);
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }
}
