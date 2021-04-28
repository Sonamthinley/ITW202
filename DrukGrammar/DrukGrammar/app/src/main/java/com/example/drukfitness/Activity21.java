package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);
    }

    public void part45(View view) {
        Intent obj = new Intent(Activity21.this, Activity19.class);
        startActivity(obj);
    }

    public void part46(View view) {
        Intent obj = new Intent(Activity21.this, Activity22.class);
        startActivity(obj);
    }
}