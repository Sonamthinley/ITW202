package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20);
    }

    public void part42(View view) {
        Intent obj = new Intent(Activity20.this, Activity19.class);
        startActivity(obj);
    }

    public void part43(View view) {
        Intent obj = new Intent(Activity20.this, Activity21.class);
        startActivity(obj);
    }

}