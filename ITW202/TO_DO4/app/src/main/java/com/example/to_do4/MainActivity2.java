package com.example.to_do4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView messagetxt;
    Button replybutton;
    EditText replytxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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