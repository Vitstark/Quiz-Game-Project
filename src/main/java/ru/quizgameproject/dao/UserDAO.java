package ru.quizgameproject.dao;


import org.springframework.stereotype.Component;
import ru.quizgameproject.creations.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author terenin
 * @author vitali перегрузи всю логику на DAO и будет заебись.
 */
@Component
public class UserDAO {

    public static int ID;

    List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User("Vitali", ++ID));
        users.add(new User("Alexandr", ++ID));
        users.add(new User("Dat", ++ID));
    }

    public User getUserByIndex(final String name){

        // возвращает юзверя по логину или нуль если того нет
        return users.stream().filter(t -> t.getName().equals(name)).findAny().orElse(null);

    }

}
