package com.example.jagadeesan.hiphoptamizha;

/**
 * Created by Mostafa Aryan Nejad on 8/11/17.
 */

public class Shoe {

    private String Title;
    private String imageUrl;
    private int price;
    public boolean selected;

    public Shoe(String title, String imageUrl,int price) {
        Title = title;
        this.imageUrl = imageUrl;
        this.price=price;
    }

    public String getTitle() {
        return Title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public int getprice() {
        return price;
    }
}
