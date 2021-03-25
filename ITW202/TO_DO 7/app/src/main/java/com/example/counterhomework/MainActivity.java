package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    int number = 0;
    Button Count_Button;
    TextView count;
    EditText Name;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onCreate");

        Count_Button = (Button)findViewById(R.id.count);
        Name = (EditText)findViewById(R.id.name);

        if (savedInstanceState != null){
            String message = savedInstanceState.getString("message");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            number = savedInstanceState.getInt("counter", 0);
        }

        Count_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               number++;
               count = (TextView)findViewById(R.id.number);
               count.setText(""+ number);

            }
        });

    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("message", "Name Saved");
        outState.putInt("counter", number);
    }
}