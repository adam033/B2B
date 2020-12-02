package com.example.android.b2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext = findViewById(R.id.next);

        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){
        Intent moveIntent = new Intent(MainActivity.this, NextActivity.class);
        startActivity(moveIntent);
    }
}