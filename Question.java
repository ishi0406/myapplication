package com.example.ishitajain.myapplication.Model;

public class Question {
    private String Question,AnswerA,AnswerB,AnswerC,AnswerD,CorrectAnswer,CategoryId,IsImageQuestion;

    public Question()
    {

    }
    public Question(String question,String answerA, String answerB,String answerC,String answerD,String correctAnswer,String categoryId,String isImageQuestion)
    {
        Question=question;
        AnswerA=answerA;
        AnswerB=answerB;
        AnswerC=answerC;
        AnswerD=answerD;
        CorrectAnswer=correctAnswer;
        this.CategoryId=categoryId;
        this.IsImageQuestion=isImageQuestion;
    }

    public String getAnswerA() {
        return AnswerA;
    }

    public String getAnswerB() {
        return AnswerB;
    }

    public String getAnswerC() {
        return AnswerC;
    }

    public String getAnswerD() {
        return AnswerD;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public String getIsImageQuestion() {
        return IsImageQuestion;
    }

    public String getQuestion() {
        return Question;
    }

    public void setAnswerA(String answerA) {
        AnswerA = answerA;
    }

    public void setAnswerB(String answerB) {
        AnswerB = answerB;
    }

    public void setAnswerC(String answerC) {
        AnswerC = answerC;
    }

    public void setAnswerD(String answerD) {
        AnswerD = answerD;
    }

    public void setCategoryId(String categoryId) {
        this.CategoryId = categoryId;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }

    public void setIsImageQuestion(String isImageQuestion) {
        this.IsImageQuestion = isImageQuestion;
    }

    public void setQuestion(String question) {
        Question = question;
    }
}
