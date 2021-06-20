package com.example.happify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button close = findViewById(R.id.close);
        close.setActivated(true);
    }
    public void test(View v){
        Intent i = new Intent(this, Test.class);
        startActivity(i);
    }
    public void breathe(View v){
        Intent i = new Intent(this,Breathe.class);
        startActivity(i);
    }
    public void read(View v){
        Intent i = new Intent(this, Read.class);
        startActivity(i);
    }
    public void close(View v){
        MainActivity.this.finish();
        System.exit(0);
    }
}