package com.jackzc.jacklistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context content, String[] foods) {
        super(content, R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View listView = inflater.inflate(R.layout.custom_row, parent, false);

        String food = getItem(position);
        TextView label = (TextView) listView.findViewById(R.id.lb_food_name);
        ImageView image = (ImageView) listView.findViewById(R.id.img_food);

        label.setText(food);
        image.setImageResource(R.drawable.sample);

        return  listView;

    }
}
