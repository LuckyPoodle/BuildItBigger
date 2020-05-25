package com.example.android.androidlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class myAndroidLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_android_library);
        String gotjoke=getIntent().getStringExtra("joke");
        TextView joke=findViewById(R.id.androidLibraryJoke);
        joke.setText(gotjoke);


    }




}
