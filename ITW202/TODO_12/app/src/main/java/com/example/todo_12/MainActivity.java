package com.example.todo_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView donut, ice, froyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        donut = findViewById(R.id.donut);
        ice = findViewById(R.id.ice);
        froyo = findViewById(R.id.froyo);
    }

    public void donuts(View view) {
        displayToast(getString(R.string.orderdonut));
    }

    public void icecream(View view) {
        displayToast(getString(R.string.orderice));
    }

    public void froyo(View view) {
        displayToast(getString(R.string.orderfroyo));
    }

    public void call(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL);
        startActivity(i);
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();

    }
}