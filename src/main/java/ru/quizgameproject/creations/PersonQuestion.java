package ru.quizgameproject.creations;
/**
 * @author terenin
 */
public class PersonQuestion implements Question {

    String value;
    Answer[] stack;
    Answer rightAnswer;

    public PersonQuestion(String value, Answer[] stack, Answer rightAnswer){

        this.value = value;
        this.rightAnswer = rightAnswer;
        this.stack = stack;

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
