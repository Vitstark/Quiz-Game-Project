package ru.quizgameproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.quizgameproject.creations.User;

@Controller
public class WebController {
    @GetMapping("/login")
    public String getLoginPage(@RequestParam(value = "name", required = false) String name,
                               Model model) {

        return "login";
    }


    @GetMapping("/choosingTopick")
    public String getChoosingPage(){

        return "html2/HTMLPage2.html";

    }

    @GetMapping("/game")
    public String getGamePage(){

        return "html2/HTMLPage3.html";

    }


    @GetMapping("/mainPage")
    public String getMainPage() {
        return "html2/HTMLpage1.html";
    }


}
