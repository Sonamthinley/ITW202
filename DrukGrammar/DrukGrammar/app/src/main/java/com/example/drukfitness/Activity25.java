package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_25);
    }

    public void part57(View view) {
        Intent obj = new Intent(Activity25.this, Activity19.class);
        startActivity(obj);
    }

    public void part62(View view) {
        Intent obj = new Intent(Activity25.this, Activity26.class);
        startActivity(obj);
    }
}