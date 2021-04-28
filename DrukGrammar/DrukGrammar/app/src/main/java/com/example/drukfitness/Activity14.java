package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);
    }

    public void part27(View view) {
        Intent obj = new Intent(Activity14.this, Activity12.class);
        startActivity(obj);
    }

    public void part28(View view) {
        Intent obj = new Intent(Activity14.this, Activity15.class);
        startActivity(obj);
    }
}