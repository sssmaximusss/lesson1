package com.csc.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imagePhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        imagePhoto = (ImageView) findViewById(R.id.photo);

        Picasso.with(this)
                .load("https://img-fotki.yandex.ru/get/27216/201887739.0/0_129bee_32848fa9_XL")
                .placeholder(R.drawable.android)
                .fit()
                .into(imagePhoto);
    }
}
