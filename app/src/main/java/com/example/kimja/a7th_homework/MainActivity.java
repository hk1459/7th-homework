package com.example.kimja.a7th_homework;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.Toast;

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
        checkBox = (CheckBox)findViewById(R.id.checkBox);

        fruit.add(new Fruit("아보카도",imagelist[0],1));
        fruit.add(new Fruit("수박",imagelist[1],2));
        fruit.add(new Fruit("바나나",imagelist[2],3));
        fruit.add(new Fruit("체리",imagelist[3],4));
        fruit.add(new Fruit("아보카도",imagelist[0],1));
        fruit.add(new Fruit("수박",imagelist[1],2));
        fruit.add(new Fruit("바나나",imagelist[2],3));
        fruit.add(new Fruit("체리",imagelist[3],4));
        adapter = new Gridadapter(this, fruit);
        gridView.setAdapter(adapter);



        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                for(int i = 0 ; i < fruit.size() ; i++){
                    fruit.get(i).setpricevi(isChecked);
                }
                adapter.notifyDataSetChanged();
            }
        });

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //add버튼 m   선택값 아래 표시

            }
        });

        customwidget customwidget2;
        customwidget2 = (customwidget)findViewById(R.id.b_add);
        customwidget2.setOnAddListener(new customwidget.OnAddListener() {
            @Override
            public void onAdd(String name, int imageno, int price) {
                adapter.fruit.add(new Fruit(name,imagelist[imageno],price));
            }
        });




    }

}
