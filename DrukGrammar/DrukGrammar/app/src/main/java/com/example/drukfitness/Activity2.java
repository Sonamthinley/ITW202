package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }

    public void part1(View view) {
        Intent obj = new Intent(Activity2.this, Activity3.class);
        startActivity(obj);

    }

    public void part16(View view) {
        Intent obj = new Intent(Activity2.this,Activity9.class);
        startActivity(obj);
    }

    public void part22(View view) {
        Intent obj = new Intent(Activity2.this, Activity12.class);
        startActivity(obj);
    }

    public void part40(View view) {
        Intent obj = new Intent(Activity2.this, Activity19.class);
        startActivity(obj);
    }
}