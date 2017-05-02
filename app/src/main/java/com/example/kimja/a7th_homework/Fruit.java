package com.example.kimja.a7th_homework;

/**
 * Created by kimja on 2017-04-27.
 */

public class Fruit {
    String name;
    int imgno;
    int price;
    boolean pricevisible;

    public Fruit (String name , int imgeno, int price,boolean pricevisible){
        this.name = name;
        this.imgno = imgeno;
        this.price = price;
        this.pricevisible = pricevisible;

    }
    public void setpricevi(boolean a){
        this.pricevisible = a;
    }
    public void setdata(String name, int imgno , int price){
        this.name = name;
        this.imgno = imgno;
        this.price = price;
    }
    public String getName() {return name;}
    public int getImgno() {return imgno;}
    public int getPrice() {return price;}
}
