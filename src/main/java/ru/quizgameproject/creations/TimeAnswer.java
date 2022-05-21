package ru.quizgameproject.creations;
/**
 * @author terenin
 */
public class TimeAnswer implements Answer{

    public boolean isRight;

    private String value;

    public TimeAnswer(boolean isRight, String value){

        this.isRight = isRight;
        this.value = value;

    }

    @Override
    public String getValue() {
        return value;
    }

}
