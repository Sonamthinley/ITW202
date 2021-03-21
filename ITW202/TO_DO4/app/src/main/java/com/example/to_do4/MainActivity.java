package com.example.to_do4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText edit_Text;
    TextView replymessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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