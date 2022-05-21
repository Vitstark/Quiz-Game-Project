package ru.quizgameproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.quizgameproject.creations.User;
import ru.quizgameproject.dao.UserDAO;

/**
 * @author terenin
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private final UserDAO users;

    public LoginController(UserDAO users){

        this.users = users;

    }

    @PostMapping
    public String logIn(@RequestParam(value = "name", required = false) String name, Model model){

        if (users.getUserByIndex(name) == null){

            User user = new User(name, ++UserDAO.ID);

            model.addAttribute("name", user);
            
            // реализовать для нормального DAO

            System.out.println("created");


        }else {

            //here is getting user from DAO

            System.out.println("asdfghjklkjhgf");

        }
        //здесь мы будем добавлять пользователя по логину в бд если его не существует или получать пользователя по логину в бд если он сужществует

        return "mainpage";

    }

}
