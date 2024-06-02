package com.mct.newspaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Customadapter extends ArrayAdapter<DocBao> {
    public Customadapter(Context context, int resource, List<DocBao> item){
        super(context,resource,item);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View view = convertView;
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.dong_layout,null);
        }

        DocBao p = getItem(position);
        if(p != null){
            TextView txtTitle = (TextView) view.findViewById(R.id.textView);
            txtTitle.setText(p.title);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            Picasso.with(getContext()).load(p.image).into(imageView);
        }
        return view;
    }
}
