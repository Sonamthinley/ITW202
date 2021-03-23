package com.example.to_do4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText edit_Text;
    TextView replymessage;
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

        //message received
        replymessage = (TextView)findViewById(R.id.reply_received);
        Intent intent = getIntent();
        String str = intent.getStringExtra("reply");
        replymessage.setText(str);


        //send message
        send_button = (Button)findViewById(R.id.button);
        edit_Text = (EditText)findViewById(R.id.editText);


        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edit_Text.getText().toString();
                Intent obj = new Intent(MainActivity.this, MainActivity2.class);
                obj.putExtra("Message", str);
                startActivity(obj);
            }
        });

    }
}