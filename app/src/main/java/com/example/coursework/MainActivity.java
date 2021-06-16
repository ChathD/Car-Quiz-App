package com.example.coursework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bCarMake;
    Button bimg;
    Button bAdvanced;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bCarMake = (Button) findViewById(R.id.car_make);
        bCarMake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CarMake.class));
            }
        });
        bimg =(Button) findViewById(R.id.car_image);
        bimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CarImage.class));
            }
        });
        bAdvanced=(Button) findViewById(R.id.car_advanced);
        bAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CarAdvancedLevel.class));
            }
        });


    }

}
