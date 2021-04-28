package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_24);
    }

    public void part54(View view) {
        Intent obj = new Intent(Activity24.this, Activity19.class);
        startActivity(obj);
    }

    public void part55(View view) {
        Intent obj = new Intent(Activity24.this, Activity25.class);
        startActivity(obj);
    }
}