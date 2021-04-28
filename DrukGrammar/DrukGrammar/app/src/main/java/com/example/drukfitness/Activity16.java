package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_16);
    }

    public void part33(View view) {
        Intent obj = new Intent(Activity16.this, Activity12.class);
        startActivity(obj);
    }

    public void part34(View view) {
        Intent obj = new Intent(Activity16.this, Activity17.class);
        startActivity(obj);
    }
}