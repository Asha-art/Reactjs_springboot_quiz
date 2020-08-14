package com.win.quizproject.controller;

import java.util.List;

import com.win.quizproject.model.Quiz;
import com.win.quizproject.repository.QuizRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class QuizController {

    @Autowired
    private QuizRepository quizRepository;

    @GetMapping("questions")
    public List<Quiz> getQuestions() {
        return this.quizRepository.findAll();
    }

}