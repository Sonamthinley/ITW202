package com.example.to_do4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView messagetxt;
    Button replybutton;
    EditText replytxt;
    private static final String LOG_TAG = MainActivity2.class.getSimpleName();

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
        setContentView(R.layout.activity_main2);

        Log.d(LOG_TAG, "---------");
        Log.d(LOG_TAG, "onCreate");

        messagetxt = (TextView)findViewById(R.id.message_txt);

        Intent intent = getIntent();
        String str = intent.getStringExtra("Message");
        messagetxt.setText(str);

        replybutton = (Button)findViewById(R.id.reply_button);
        replytxt = (EditText)findViewById(R.id.reply_txt);

        replybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = replytxt.getText().toString();
                Intent obj = new Intent(MainActivity2.this, MainActivity.class);
                obj.putExtra("reply", str);
                startActivity(obj);
            }
        });
    }
}