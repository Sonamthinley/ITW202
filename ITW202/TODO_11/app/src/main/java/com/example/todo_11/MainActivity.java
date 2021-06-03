package com.example.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button click;
    private TextView textView;
    private String[] colorArray = {"purple_200", "purple_500", "purple_700", "teal_200", "teal_700", "black", "white"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.button);

        textView = findViewById(R.id.textView);

    }

    public void changethecolor(View view) {

        //create Random class
        Random random =  new Random();

        //use random to select colors from Array of colors
        String ColorSelection = colorArray[random.nextInt(7)];

        int colorResourceName = getResources().getIdentifier(ColorSelection, "color", getApplicationContext().getPackageName());

        /*int ColorRes = getResources().getColor(colorResourceName, this.getTheme());*/

        //ContextCompat is used to retrieve resources such as drawable or colors.
        int ColorRes = ContextCompat.getColor(this, colorResourceName);

        textView.setTextColor(ColorRes);





    }
}