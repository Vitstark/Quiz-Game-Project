package ru.quizgameproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.quizgameproject.creations.Question;
import ru.quizgameproject.dao.QuestionDAO;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/answer_choosing")
public class AnswerController {
    private final QuestionDAO questionDAO;

    @Autowired
    public AnswerController(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }


    @GetMapping()
    public String answerChoosing(Model model) {
        Random random = new Random();
        return answerChoosing(random.nextInt(1) + 1, model);
    }

    @GetMapping("/{themeId}")
    public String answerChoosing(@PathVariable("themeId") int themeId, Model model) {
        Random random = new Random();
        Question question = questionDAO
                .getThemeQuestions(themeId)
                .get(random.nextInt());
        String[] unCorrectQuestions = question.getUnCorrectAnswer();
        model.addAttribute("body_of_question", question.getBodyOfQuestion());
        model.addAttribute("correct_answer", question.getCorrectAnswer());
        return "answer_choosing";
    }

}
