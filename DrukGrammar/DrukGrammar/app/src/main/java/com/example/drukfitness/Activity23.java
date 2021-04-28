package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_23);
    }

    public void part51(View view) {
        Intent obj = new Intent(Activity23.this, Activity19.class);
        startActivity(obj);
    }

    public void part52(View view) {
        Intent obj = new Intent(Activity23.this, Activity24.class);
        startActivity(obj);
    }
}