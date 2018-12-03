package com.example.ishitajain.myapplication.Model;

public class Category {
    private String Name;
    private String Image;

    public Category(){

    }

    public Category(String name, String image)
    {
        Name=name;
        Image=image;
    }

    public String getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setImage(String image) {
        Image = image;
    }
}
