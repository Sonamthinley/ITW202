package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void part2(View view) {
        Intent obj = new Intent(Activity3.this, Activity4.class);
        startActivity(obj);
    }

    public void part4(View view) {
        Intent obj = new Intent(Activity3.this, Activity5.class);
        startActivity(obj);
    }

    public void part6(View view) {
        Intent obj = new Intent(Activity3.this, Activity6.class);
        startActivity(obj);
    }

    public void part8(View view) {
        Intent obj = new Intent(Activity3.this, Activity7.class);
        startActivity(obj);
    }

    public void part10(View view) {
        Intent obj = new Intent(Activity3.this, Activity8.class);
        startActivity(obj);
    }
}