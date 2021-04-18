package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
    }

    public void part9(View view) {
        Intent obj = new Intent(Activity7.this, Activity8.class);
        startActivity(obj);
    }

    public void part12(View view) {
        Intent it = new Intent(Activity7.this, Activity6.class);
        startActivity(it);
    }
}