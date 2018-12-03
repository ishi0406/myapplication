package com.example.ishitajain.myapplication.Model;

public class Ranking {
    private String userName;
    private long score;

    public Ranking()
    {

    }

    public Ranking(String userName,long score)
    {
        this.userName=userName;
        this.score=score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public long getScore() {
        return score;
    }
}
