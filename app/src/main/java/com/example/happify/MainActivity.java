package com.example.happify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatButton testB = findViewById(R.id.test);
        AppCompatButton readB = findViewById(R.id.read);
        AppCompatButton breatheB = findViewById(R.id.breathe);
        AppCompatButton closeB = findViewById(R.id.close);
        testB.setOnClickListener((View v) -> startActivity(new Intent(this, Test.class)));
        readB.setOnClickListener((View v) -> startActivity(new Intent(this, Read.class)));
        breatheB.setOnClickListener((View v) -> startActivity(new Intent(this, Breathe.class)));
        closeB.setOnClickListener((View v) -> {
            MainActivity.this.finish();
            System.exit(1);
        });
    }
}