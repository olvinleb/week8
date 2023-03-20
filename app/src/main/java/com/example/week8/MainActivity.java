package com.example.week8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1Str;
    private EditText num2Str;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1Str = findViewById(R.id.num1);
        //int num1 = Integer.parseInt(String.valueOf(num1Str.getText()));

        num2Str = findViewById(R.id.num2);
        //int num2 = Integer.parseInt(String.valueOf(num2Str.getText()));
        output = findViewById(R.id.output);
    }


    public void addNumbers(View view) {
        int num1 = Integer.parseInt(String.valueOf(num1Str.getText()));
        int num2 = Integer.parseInt(String.valueOf(num2Str.getText()));
        int res = num1 + num2;
        output.setText(String.valueOf(res));

    }

    public void subtractNumbers(View view){
        int num1 = Integer.parseInt(String.valueOf(num1Str.getText()));
        int num2 = Integer.parseInt(String.valueOf(num2Str.getText()));
        int res = num1 - num2;
        output.setText(String.valueOf(res));

    }

    public void multiplyNumbers(View view){
        int num1 = Integer.parseInt(String.valueOf(num1Str.getText()));
        int num2 = Integer.parseInt(String.valueOf(num2Str.getText()));
        int res = num1 * num2;
        output.setText(String.valueOf(res));

    }

    public void divideNumbers(View view){
        int num1 = Integer.parseInt(String.valueOf(num1Str.getText()));
        int num2 = Integer.parseInt(String.valueOf(num2Str.getText()));
        int res = num1 / num2;
        output.setText(String.valueOf(res));

    }
}