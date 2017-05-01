package com.example.kimja.a7th_homework;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class Gridadapter extends BaseAdapter {
    Context context;
    ArrayList<Fruit> fruit;

    Gridadapter(Context context, ArrayList<Fruit> fruit) {
        this.context = context;
        this.fruit = fruit;
    }


    @Override
    public int getCount() {
        return fruit.size();
    }

    @Override
    public Object getItem(int position) {
        return fruit.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        if(convertView == null)
//            convertView = LayoutInflater.from(context).inflate(R.layout.griditem,null);
//
//        final TextView tv = (TextView)convertView.findViewById(R.id.tvname);
//        final ImageView image = (ImageView)convertView.findViewById(R.id.img1);
//        final TextView price = (TextView)convertView.findViewById(R.id.price);
//        tv.setText(fruit.get(position).name);
//        image.setImageResource(fruit.get(position).imgno);
//        price.setText(fruit.get(position).price);

        if (convertView == null){
            convertView = new Griditem(context);
        }
        ((Griditem)convertView).setData(fruit.get(position));
        return convertView;
    }
}