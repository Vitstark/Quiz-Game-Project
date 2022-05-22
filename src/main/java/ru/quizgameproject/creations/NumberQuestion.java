package ru.quizgameproject.creations;
/**
 * @author terenin
 */
public class NumberQuestion implements Question{

    String value;

    Answer[] stack;
    Answer rightAnswer;

    public NumberQuestion(String value, Answer[] stack, Answer rightAnswer){

        this.rightAnswer = rightAnswer;
        this.stack = stack;
        this.value = value;

    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setRightAnswer() {

    }

    @Override
    public Answer getRightAnswer() {
        return rightAnswer;
    }
}
