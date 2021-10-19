package com.example.currencyconverter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     EditText userInputText;
     String userInputString;
     double userInputDouble;
     double output;
     String outputString;


    public void convertingButtonFunction(View v){



        userInputText = (EditText) findViewById(R.id.curText);
        userInputString = userInputText.getText().toString();
        userInputDouble = Double.parseDouble(userInputString);
        output = userInputDouble * 74.09;
        outputString = Double.toString(output);

        Context context = getApplicationContext();
    CharSequence text = outputString;
    int duration = Toast.LENGTH_SHORT;

    Toast toast = Toast.makeText(context, text, duration);
        toast.show();
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}