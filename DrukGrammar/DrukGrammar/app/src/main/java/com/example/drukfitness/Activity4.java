package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void part3(View view) {
        Intent obj = new Intent(Activity4.this, Activity5.class);
        startActivity(obj);
    }

    public void part15(View view) {
        Intent it = new Intent(Activity4.this, Activity3.class);
        startActivity(it);
    }
}