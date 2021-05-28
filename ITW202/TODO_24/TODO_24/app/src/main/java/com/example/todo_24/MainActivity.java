package com.example.todo_24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private int mColor;

    private final String COUNT_KEY = "count";
    private final String COLOR_KEY = "color";

    private SharedPreferences mPreferences;
    private String sharedPrefFile = "com.example.todo_24";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.count_textView);
        mColor = ContextCompat.getColor(this, R.color.default_background);
        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);

        mCount = mPreferences.getInt(COUNT_KEY, 0);
        mShowCount.setText(String.format("%s", mCount));
        mColor = mPreferences.getInt(COLOR_KEY, mColor);
        mShowCount.setBackgroundColor(mColor);
    }

    @Override
    protected void onPause() {
        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.putInt(COUNT_KEY, mCount);
        preferencesEditor.putInt(COLOR_KEY, mColor);
        super.onPause();
    }

    public void changebackground(View view) {
        int color = ((ColorDrawable) view.getBackground()).getColor();
        mShowCount.setBackgroundColor(color);
        mColor = color;
    }

    public void CountUp(View view) {
        mCount++;
        mShowCount.setText(String.format("%s", mCount));
    }

    public void reset(View view) {
        mCount = 0;
        mShowCount.setText(String.format("%s", mCount));

        mColor = ContextCompat.getColor(this, R.color.default_background);
        mShowCount.setBackgroundColor(mColor);

        SharedPreferences.Editor preferencesEditor = mPreferences.edit();
        preferencesEditor.clear();
        preferencesEditor.apply();
    }
}