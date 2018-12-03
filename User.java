package com.example.ishitajain.myapplication.Model;

public class User {
    private String userName;
    private String password;
    private String email;

    public User () {

    }

    public User(String userName,String password, String email) {
        this.userName=userName;
        this.password=password;
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
