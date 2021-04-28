package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);
    }

    public void part30(View view) {
        Intent obj = new Intent(Activity15.this, Activity12.class);
        startActivity(obj);
    }

    public void part31(View view) {
        Intent obj = new Intent(Activity15.this, Activity16.class);
        startActivity(obj);
    }
}