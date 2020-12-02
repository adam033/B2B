package com.example.android.b2b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah);
        ImageView what = findViewById(R.id.what);
        ImageView how = findViewById(R.id.how);
        ImageView why = findViewById(R.id.why);

        what.setOnClickListener(this);
        how.setOnClickListener(this);
        why.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.what:
                Intent whatIntent = new Intent(NextActivity.this, What.class);
                startActivity(whatIntent);
                break;
            case R.id.how:
                Intent howIntent = new Intent(NextActivity.this, How.class);
                startActivity(howIntent);
                break;
            case R.id.why:
                Intent whyIntent = new Intent(NextActivity.this, Why.class);
                startActivity(whyIntent);
                break;
        }
    }



}
