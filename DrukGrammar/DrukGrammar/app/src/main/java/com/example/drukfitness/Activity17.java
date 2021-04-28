package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_17);
    }

    public void part36(View view) {
        Intent obj = new Intent(Activity17.this, Activity12.class);
        startActivity(obj);
    }

    public void part38(View view) {
        Intent obj = new Intent(Activity17.this, Activity18.class);
        startActivity(obj);
    }
}