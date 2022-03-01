package com.example.imagegallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PhotoAdapter extends BaseAdapter {
    private ArrayList<Photo> photo_list;
    private Context context;
    public PhotoAdapter(ArrayList<Photo> photo_list, Context context) {
        this.photo_list = photo_list;
        this.context = context;
    }
    @Override
    public int getCount(){return photo_list.size();}
    @Override
    public Object getItem(int position) {return photo_list.get(position);}
    @Override
    public long getItemId(int position) {return photo_list.get(position).getId();}
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final MyView dataitem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView==null){
            dataitem = new MyView();
            convertView = inflater.inflate(R.layout.content_layout,null);
            dataitem.imv_photo = convertView.findViewById(R.id.imv_photo);
            convertView.setTag(dataitem);
        } else {
            dataitem = (MyView) convertView.getTag();
        }
        Picasso.get().load(photo_list.get(position).getSource_photo()).resize(400,400).centerCrop().into(dataitem.imv_photo);
        return convertView;
    }

    private static class MyView{
        ImageView imv_photo;
    }
}
