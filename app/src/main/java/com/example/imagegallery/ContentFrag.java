package com.example.imagegallery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ContentFrag extends Fragment {
    TextView tv_test;
    GridView gridview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.content_frag,container,false);
        gridview = (GridView) view.findViewById(R.id.gridview);
        return view;
    }
    public void change(String menus){
        ArrayList<Photo> photos = PhotoData.generatePhotoData();
        ArrayList<Photo> filter = new ArrayList<>();
        for (int i=0;i<photos.size();i++){
            if (photos.get(i).getPhoto_name()==menus){
                filter.add(photos.get(i));
            }
        }
        PhotoAdapter adapter = new PhotoAdapter(filter,getContext());
        gridview.setAdapter(adapter);
    }
}
