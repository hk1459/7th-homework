package com.example.kimja.a7th_homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Griditem extends LinearLayout{
    TextView tv,price;
    ImageView image;

    public Griditem(Context context) {
        super(context);
        init(context);
    }

    public void init(Context context){
        View view = LayoutInflater.from(context).inflate(R.layout.griditem,this);

        tv = (TextView)findViewById(R.id.tvname);
        image = (ImageView)findViewById(R.id.img1);
        price  =(TextView)findViewById(R.id.price);
    }
    public void setData(Fruit one) {
        //에러
        tv.setText(one.name);
        image.setImageResource(one.imgno);
    }

}