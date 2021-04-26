package com.example.todo_8ii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent obj = getIntent();
        Uri url = obj.getData();

        if (url!=null){
            String str = "URI: "+ url.toString();
            message = (TextView)findViewById(R.id.textView);
            message.setText(str);
        }

    }
}