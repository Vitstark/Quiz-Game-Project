package ru.quizgameproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.quizgameproject.creations.User;

@Controller
@RequestMapping("/")
public class WebController {
    @GetMapping("login")
    public String getLoginPage(@RequestParam(value = "name", required = false) String name,
                               Model model) {
        return "login";
    }

    @GetMapping("topick_choosing")
    public String getChoosingPage(){
        return "topic_choosing";
    }
/*
    @GetMapping("answer_choosing")
    public String getGamePage(){
        return "answer_choosing";
    }
 */

    @GetMapping("main")
    public String getMainPage() {
        return "main";
    }
}
