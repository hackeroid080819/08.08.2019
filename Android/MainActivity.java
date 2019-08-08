package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.btn1);

        Toast.makeText(this, "Button was clicked!", Toast.LENGTH_LONG).show();

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final TextView textview = findViewById(R.id.txt1);
                textview.setText("Button was clicked!");
            }
        });
    }
}
