package com.example.xmlandjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText myEditText;
    Button myBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText = findViewById(R.id.editText);
        myBtn = findViewById(R.id.myButton);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = myEditText.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome " + inputText + " to our App", Toast.LENGTH_SHORT).show();
            }
        });
    }
}