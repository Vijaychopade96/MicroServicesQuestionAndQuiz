package com.quiz.Controller;

import com.quiz.Entity.Quiz;
import com.quiz.Service.QuizServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizServiceImpl quizService;

    public QuizController(QuizServiceImpl quizService) {
        this.quizService = quizService;
    }


    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);


    }
    @GetMapping
    public List<Quiz>getAll(){
        return quizService.get();

    }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);

    }



}
