package com.calculator.kanis.logiccrackers;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    Integer[] images={R.drawable.tortoise,R.drawable.rabbit};
    String[] level={"EASY","HARD"};

    public MyListAdapter(Context context) {
        this.context=context;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup arg2) {
        view=layoutInflater.inflate(R.layout.levels_list,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.img);
        TextView tvlevel=(TextView)view.findViewById(R.id.lvlname);
        imageView.setImageResource(images[position]);
        tvlevel.setText(level[position]);
        return view;

    }
}
