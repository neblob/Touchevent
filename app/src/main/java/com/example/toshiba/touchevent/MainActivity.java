package com.example.toshiba.touchevent;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Myview myview = new Myview(this);
        myview.setBackgroundColor(Color.WHITE);
        setContentView(myview);

    }
}
