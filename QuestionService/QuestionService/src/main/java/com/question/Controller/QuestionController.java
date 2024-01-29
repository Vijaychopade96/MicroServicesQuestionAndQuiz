package com.question.Controller;

import com.question.Entity.Question;
import com.question.Service.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionServiceImpl questionService;


    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question>getAll(){
        return questionService.get();

    }
    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id){
        return questionService.get(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question>getQuestionQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }




}
