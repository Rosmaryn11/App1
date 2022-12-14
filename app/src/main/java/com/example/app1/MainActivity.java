package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method to change the TextView content
    public void btnChangeTextClick(View v){
        TextView tv = (TextView)findViewById(R.id.MainTextView);
        tv.setText("New Text");
    }

    // Method to change the TextView text color
    public void btnChangeColorClick(View v){
        TextView tv = (TextView)findViewById(R.id.MainTextView);
        tv.setTextColor(Color.parseColor("#7b7cf8"));
    }

}