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
    CheckBox checkBox;
    int posi;
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

        final customwidget customwidget3;
        customwidget3 = (customwidget)findViewById(R.id.add);
        customwidget3.setOnAddListener(new customwidget.OnAddListener() {
            @Override
            public void onAdd(String name, int imageno, int price) {
                if(customwidget3.b_add.getText() == "M"){
                    adapter.fruit.set(posi,new Fruit(name,imagelist[imageno],price,checkBox.isChecked()));
                    customwidget3.b_add.setText("ADD");
                    posi = 0;
                    customwidget.et.setText("");
                    customwidget.et2.setText("");
                    customwidget.imageno = 0;
                    customwidget.img.setImageResource(imagelist[customwidget.imageno]);
                }
                else {
                    adapter.fruit.add(new Fruit(name,imagelist[imageno],price,checkBox.isChecked()));
                    customwidget.et.setText("");
                    customwidget.et2.setText("");
                    customwidget.imageno = 0;
                    customwidget.img.setImageResource(imagelist[customwidget.imageno]);
                }
                adapter.notifyDataSetChanged();
            }
        });

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                customwidget.b_add.setText("M");
                customwidget.et.setText(fruit.get(position).getName());
                customwidget.et2.setText(Integer.toString(fruit.get(position).getPrice()));
                customwidget.img.setImageResource(fruit.get(position).imgno);
                for(int i = 0; i< imagelist.length; i++){
                    if(imagelist[i] == fruit.get(position).imgno){
                        customwidget.imageno = i+1;
                    }
                }
                posi = position;
            }
        });
    }

}
