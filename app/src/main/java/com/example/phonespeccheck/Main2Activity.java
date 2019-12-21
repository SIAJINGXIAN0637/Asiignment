package com.example.phonespeccheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private ImageView a5s, a92020;
    private ImageView reno2, reno10x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        a5s = (ImageView) findViewById(R.id.a_5s);
        a92020 = (ImageView) findViewById(R.id.a9_2020);
        reno2 = (ImageView) findViewById(R.id.reno_2);
        reno10x = (ImageView) findViewById(R.id.reno_10x);



        a5s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, A5s.class);
                startActivity(intent);


            }
        });

        a92020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,A92020.class);
                startActivity(intent);

            }
        });

        reno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Reno2.class);
                startActivity(intent);

            }
        });

        reno10x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, com.example.phonespeccheck.reno10x.class);
                startActivity(intent);

            }
        });




    }
}