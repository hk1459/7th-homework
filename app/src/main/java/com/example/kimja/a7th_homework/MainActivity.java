package com.example.kimja.a7th_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Fruit> fruit = new ArrayList<Fruit>();
    final int[] imagelist = {R.drawable.abocado,R.drawable.banana
            ,R.drawable.cherry,R.drawable.cranberry,R.drawable.grape,R.drawable.kiwi,R.drawable.orange
            ,R.drawable.watermelon};

    Gridadapter adapter;
    GridView gridView;
    Button button;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("What is your favorite fruit?");

        init();
    }
    void init(){
        gridView = (GridView)findViewById(R.id.grid);
        button = (Button)findViewById(R.id.button);
        checkBox = (CheckBox)findViewById(R.id.checkBox);

        fruit.add(new Fruit("아보카도",imagelist[0],1));
        fruit.add(new Fruit("수박",imagelist[1],2));
        fruit.add(new Fruit("바나나",imagelist[2],3));
        fruit.add(new Fruit("체리",imagelist[3],4));
        adapter = new Gridadapter(this, fruit);
        gridView.setAdapter(adapter);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) ;
                else ;
            }
        });
    }
}
