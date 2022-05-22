/*
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
        model.addAttribute("mesage", "HI " + name);

        return "login";
    }




    @GetMapping("/mainpage")
    public String getMainPage() {
        return "mainpage";
    }


}
*/
