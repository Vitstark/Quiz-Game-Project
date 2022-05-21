package ru.quizgameproject.creations;
/**
 * @author terenin
 */
public class User {

    public String name;

    private int id;

    private int highScore;

    public User(String name, int id){

        this.id = id;
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
}
