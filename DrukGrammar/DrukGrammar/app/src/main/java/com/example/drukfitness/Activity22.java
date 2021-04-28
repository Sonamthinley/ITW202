package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);
    }

    public void part48(View view) {
        Intent obj = new Intent(Activity22.this, Activity19.class);
        startActivity(obj);
    }

    public void part49(View view) {
        Intent obj = new Intent(Activity22.this, Activity23.class);
        startActivity(obj);
    }
}