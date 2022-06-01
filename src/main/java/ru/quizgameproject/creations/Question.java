package ru.quizgameproject.creations;
/**
 * @author terenin
 */
public class Question {
    private int theme;
    private String BodyOfQuestion;
    private String correctAnswer;
    private String[] unCorrectAnswers;

    public Question(){}

    public Question(int theme, String bodyOfQuestion, String correctAnswer, String[] unCorrectAnswers) {
        this.theme = theme;
        this.BodyOfQuestion = bodyOfQuestion;
        this.correctAnswer = correctAnswer;
        this.unCorrectAnswers = unCorrectAnswers;
    }

    public int getTheme() {
        return theme;
    }

    public void setTheme(int theme) {
        this.theme = theme;
    }

    public String getBodyOfQuestion() {
        return BodyOfQuestion;
    }

    public void setBodyOfQuestion(String bodyOfQuestion) {
        BodyOfQuestion = bodyOfQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String[] getUnCorrectAnswer() {
        return unCorrectAnswers;
    }

    public void setUnCorrectAnswer(String[] unCorrectAnswers) {
        this.unCorrectAnswers = unCorrectAnswers;
    }
}
