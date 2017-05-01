package com.example.kimja.a7th_homework;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class customwidget extends LinearLayout implements View.OnClickListener {
    int imageno= 1;
    EditText et,et2;
    ImageView img;
    Button b_next, b_add;
    final int[] imagelist = {R.drawable.abocado,R.drawable.banana
            ,R.drawable.cherry,R.drawable.cranberry,R.drawable.grape,R.drawable.kiwi,R.drawable.orange
            ,R.drawable.watermelon};

    public customwidget (Context context , AttributeSet attrs){
        super(context , attrs);
        init(context);
    }

    void init( Context context){
        LayoutInflater.from(context).inflate(R.layout.fruitadd,this);
        et = (EditText)findViewById(R.id.f_name); // autocomplete
        et2 = (EditText)findViewById(R.id.f_price);
        img = (ImageView)findViewById(R.id.image1);
        b_next = (Button)findViewById(R.id.b_next);
        b_add = (Button)findViewById(R.id.b_add);
        b_next.setOnClickListener(this);
        b_add.setOnClickListener(this);
    }
    interface  OnAddListener {
        void onAdd(String name, int imageno, int price);
    }
    public OnAddListener onAddListener;
    public void setOnAddListener(OnAddListener onAddListener){
        this.onAddListener = onAddListener;
    }

    @Override
    public void onClick(View v) {
        if(v==b_add){
//            et.getText().toString()
            onAddListener.onAdd(et.getText().toString(),
                    imageno,Integer.parseInt(et2.getText().toString()));
        }
        else if(v == b_next){
            if(imageno == 8) imageno = 0;
            img.setImageResource(imagelist[imageno]);
            imageno++;
        }

    }
}