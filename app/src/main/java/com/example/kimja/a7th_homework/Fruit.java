package com.example.kimja.a7th_homework;

/**
 * Created by kimja on 2017-04-27.
 */

public class Fruit {
    String name;
    int imgno;
    int price;
    static final int[] imagelist = {R.drawable.abocado,R.drawable.banana
            ,R.drawable.cherry,R.drawable.cranberry,R.drawable.grape,R.drawable.kiwi,R.drawable.orange
            ,R.drawable.watermelon};
    public Fruit (String name , int imgeno, int price){
        this.name = name;
        this.imgno = imgeno;
        this.price = price;
    }
}
