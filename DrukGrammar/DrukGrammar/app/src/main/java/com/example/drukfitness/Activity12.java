package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);
    }

    public void part23(View view) {
        Intent obj = new Intent(Activity12.this, Activity13.class);
        startActivity(obj);
    }

    public void part25(View view) {
        Intent obj = new Intent(Activity12.this, Activity14.class);
        startActivity(obj);
    }

    public void part29(View view) {
        Intent obj = new Intent(Activity12.this, Activity15.class);
        startActivity(obj);
    }

    public void part32(View view) {
        Intent obj = new Intent(Activity12.this, Activity16.class);
        startActivity(obj);
    }

    public void part35(View view) {
        Intent obj = new Intent(Activity12.this, Activity17.class);
        startActivity(obj);
    }

    public void part37(View view) {
        Intent obj = new Intent(Activity12.this, Activity18.class);
        startActivity(obj);
    }

    public void part60(View view) {
        Intent obj = new Intent(Activity12.this, Activity2.class);
        startActivity(obj);
    }
}