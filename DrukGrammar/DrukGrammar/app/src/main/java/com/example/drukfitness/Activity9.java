package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);
    }

    public void part17(View view) {
        Intent obj = new Intent(Activity9.this, Activity10.class);
        startActivity(obj);
    }

    public void part21(View view) {
        Intent obj = new Intent(Activity9.this, Activity11.class);
        startActivity(obj);
    }

    public void part58(View view) {
        Intent obj = new Intent(Activity9.this, Activity2.class);
        startActivity(obj);
    }
}