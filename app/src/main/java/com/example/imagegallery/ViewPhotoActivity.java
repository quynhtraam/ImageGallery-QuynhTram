package com.example.imagegallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ViewPhotoActivity extends AppCompatActivity {
    ImageView imv_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photo);

        imv_detail = findViewById(R.id.imv_detail);
        int id = (int) getIntent().getLongExtra("id",0);
        Picasso.get().load(PhotoData.getPhotoFromId(id).getSource_photo()).resize(500,500).centerCrop().into(imv_detail);
    }
}