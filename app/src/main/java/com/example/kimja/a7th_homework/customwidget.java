package com.example.kimja.a7th_homework;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by kimja on 2017-04-27.
 */

public class customwidget extends LinearLayout implements View.OnClickListener {
    int imageno= 0;
    EditText et;
    ImageView img;
    Button b_next, b_add;

    public customwidget (Context context , AttributeSet attrs){
        super(context , attrs);
        init(context);
    }

    void init( Context context){
        LayoutInflater.from(context).inflate(R.layout.fruitadd,this);
        et = (EditText)findViewById(R.id.f_name);
        img = (ImageView)findViewById(R.id.image1);
        b_next = (Button)findViewById(R.id.b_next);
        b_add = (Button)findViewById(R.id.b_add);
        b_next.setOnClickListener(this);
        b_add.setOnClickListener(this);
    }
    ////
    interface OnAddListener {
        void onAdd(String name , int imageno);

//        void onCancel(String name, int imageno);

    }

    public OnAddListener onAddListener;

    public void setOnAddListener(OnAddListener onAddListener) {
        this.onAddListener = onAddListener;
    }
    ////

    @Override
    public void onClick(View v) {
        if(v==b_add){
            onAddListener.onAdd(et.getText().toString(),Fruit.imagelist[imageno]);
        } else{
            if(imageno == Fruit.imagelist.length - 1) imageno = -1;
            img.setImageResource(Fruit.imagelist[++imageno]);
        }
    }
}