package ru.quizgameproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.quizgameproject.creations.Question;
import ru.quizgameproject.dao.QuestionDAO;

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
        return answerChoosing(model, random.nextInt(3) + 1);
    }

    @GetMapping("/{themeId}")
    public String answerChoosing(Model model, @PathVariable("themeId") int themeId) {
        Random random = new Random();
        Question question = questionDAO
                .getThemeQuestions(themeId)
                .get(random.nextInt(10));
        String[] unCorrectAnswers = question.getUnCorrectAnswer();
        model.addAttribute("body_of_question", question.getBodyOfQuestion());
        String[] answersForPage = getStackOfAnswers(unCorrectAnswers);
        answersForPage[random.nextInt(3)] = question.getCorrectAnswer();
        model.addAttribute("answer1", answersForPage[0]);
        model.addAttribute("answer2", answersForPage[1]);
        model.addAttribute("answer3", answersForPage[2]);
        model.addAttribute("correctAnswer", question.getCorrectAnswer());
        return "answer_choosing";
    }

    private static String[] getStackOfAnswers(String[] unCorrectAnswers) {
        String [] stackOfAnswers = new String[3];
        Random random = new Random();
        for (int i = 0; i < stackOfAnswers.length; i++) {
            int index = random.nextInt(unCorrectAnswers.length);
            while (unCorrectAnswers[index] == null) {
                index = random.nextInt(unCorrectAnswers.length);
            }
            stackOfAnswers[i] = unCorrectAnswers[index];
            unCorrectAnswers[index] = null;
        }
        return stackOfAnswers;
    }
}