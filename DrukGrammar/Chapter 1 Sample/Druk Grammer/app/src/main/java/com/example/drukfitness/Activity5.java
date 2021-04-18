package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    public void part5(View view) {
        Intent obj = new Intent(Activity5.this, Activity6.class);
        startActivity(obj);
    }

    public void part14(View view) {
        Intent it = new Intent(Activity5.this, Activity4.class);
        startActivity(it);
    }
}