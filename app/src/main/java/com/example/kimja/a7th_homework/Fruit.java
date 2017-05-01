package com.example.kimja.a7th_homework;

/**
 * Created by kimja on 2017-04-27.
 */

public class Fruit {
    String name;
    int imgno;
    int price;
    boolean pricevisible;

    public Fruit (String name , int imgeno, int price){
        this.name = name;
        this.imgno = imgeno;
        this.price = price;

    }
    public void setpricevi(boolean a){
        this.pricevisible = a;
    }
    public void setdata(String name, int imgno , int price){
        this.name = name;
        this.imgno = imgno;
        this.price = price;
    }
}
