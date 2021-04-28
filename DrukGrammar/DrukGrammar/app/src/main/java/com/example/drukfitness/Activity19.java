package com.example.drukfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_19);
    }

    public void part41(View view) {
        Intent obj = new Intent(Activity19.this, Activity20.class);
        startActivity(obj);
    }

    public void part44(View view) {
        Intent obj = new Intent(Activity19.this, Activity21.class);
        startActivity(obj);
    }

    public void part47(View view) {
        Intent obj = new Intent(Activity19.this, Activity22.class);
        startActivity(obj);
    }

    public void part50(View view) {
        Intent obj = new Intent(Activity19.this, Activity23.class);
        startActivity(obj);
    }

    public void part53(View view) {
        Intent obj = new Intent(Activity19.this, Activity24.class);
        startActivity(obj);
    }

    public void part56(View view) {
        Intent obj = new Intent(Activity19.this, Activity25.class);
        startActivity(obj);
    }

    public void part61(View view) {
        Intent obj = new Intent(Activity19.this, Activity2.class);
        startActivity(obj);
    }
}