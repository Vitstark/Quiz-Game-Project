package ru.quizgameproject.creations;
/**
 * @author terenin
 */
public class PersonAnswer implements Answer{

    String value;
    boolean isRight;

    public PersonAnswer(boolean isRight, String value){

        this.isRight = isRight;
        this.value = value;

    }

    @Override
    public String getValue() {
        return null;
    }
}
