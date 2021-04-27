package com.example.todo_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2, result;
    Button add, sub, mul, div;
    Calculator mCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalculator = new Calculator();
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.button1);
        sub = findViewById(R.id.button2);
        mul = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        result = findViewById(R.id.result);

    }

    public void add(View view) {
        String OperandOne = num1.getText().toString();
        String OperandTwo = num2.getText().toString();

        double value = mCalculator.ADD(Double.valueOf(OperandOne), Double.valueOf(OperandTwo) );
        result.setText(String.valueOf(value));

    }
    public void sub(View view) {
        String OperandOne = num1.getText().toString();
        String OperandTwo = num2.getText().toString();
        double value = mCalculator.SUB(Double.valueOf(OperandOne), Double.valueOf(OperandTwo) );
        result.setText(String.valueOf(value));
    }

    public void mul(View view) {
        String OperandOne = num1.getText().toString();
        String OperandTwo = num2.getText().toString();
        double value = mCalculator.MUL(Double.valueOf(OperandOne), Double.valueOf(OperandTwo) );
        result.setText(String.valueOf(value));
    }

    public void div(View view) {
        String OperandOne = num1.getText().toString();
        String OperandTwo = num2.getText().toString();
        double value = mCalculator.DIV(Double.valueOf(OperandOne), Double.valueOf(OperandTwo) );
        result.setText(String.valueOf(value));
    }
}