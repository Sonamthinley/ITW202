package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);
    }

    public void part24(View view) {
        Intent obj = new Intent(Activity13.this, Activity12.class);
        startActivity(obj);
    }

    public void part26(View view) {
        Intent obj = new Intent(Activity13.this, Activity14.class);
        startActivity(obj);
    }
}