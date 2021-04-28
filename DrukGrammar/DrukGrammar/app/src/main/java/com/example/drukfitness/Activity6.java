package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
    }

    public void part7(View view) {
        Intent obj = new Intent(Activity6.this, Activity7.class);
        startActivity(obj);
    }

    public void part13(View view) {
        Intent it = new Intent(Activity6.this, Activity3.class);
        startActivity(it);
    }
}