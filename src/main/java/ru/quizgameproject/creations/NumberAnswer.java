package ru.quizgameproject.creations;
/**
 * @author terenin
 */
public class NumberAnswer implements  Answer{

    String value;

    boolean isRight;

    public NumberAnswer(String value, boolean isRight){

        this.isRight = isRight;
        this.value = value;

    }

    @Override
    public String getValue() {
        return null;
    }
}
