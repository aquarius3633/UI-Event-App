package com.example.uieventapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.inputText);
        editText.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                empty(v);
            }
        });
    }

    public void displayMessage(View view) {
        final TextView textView =
                (TextView) findViewById(R.id.textViewOutput);
        EditText editText = (EditText) findViewById(R.id.inputText);
        if (editText.getText().length() == 0){
            textView.setText("Please enter a message");
        } else {
            textView.setText(editText.getText());
        }

    }

    public void empty(View view) {
        EditText editText = (EditText) findViewById(R.id.inputText);
        editText.setText(null);
    }

    public void reset(View view) {
        TextView textview = (TextView) findViewById(R.id.textViewOutput);
        textview.setText("Moblie Technologies");
    }

}
