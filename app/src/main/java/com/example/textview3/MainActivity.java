package com.example.textview3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tV;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);

    }

    public void dodge(View view) {
        counter +=1;
        tV.setText("This is a click number: "+counter);
        tV.setTextColor(Color.BLUE);
        if (counter==6)
        {
            tV.setText("Enough to click. Go to new start!");
            tV.setTextColor(Color.RED);
            counter=0;
        }
    }
}