package ru.quizgameproject.creations;
/**
 * @author terenin
 */
public class TimeQestion implements Question{

    String value;

    Answer rightAnswer;
    Answer[] stack;

    public TimeQestion(String value, Answer[] stack, Answer rightAnswer){

        this.stack = stack; // here is 4 question one of them we need to point like right
        this.value = value;
        this.rightAnswer = rightAnswer;

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
        return null;
    }
}
