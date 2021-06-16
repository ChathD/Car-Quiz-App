package com.example.coursework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Random;

public class CarAdvancedLevel extends AppCompatActivity {

    ImageView imgLvl1;
    ImageView imgLvl2;
    ImageView imgLvl3;
    Button AdvLvl;
    EditText userAnswer1;
    EditText userAnswer2;
    EditText userAnswer3;
    String userAnswer1toStr,userAnswer2toStr,userAnswer3toStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Random AdvancedR = new Random();
        setContentView(R.layout.activity_car_advanced_level);
        imgLvl1=(ImageView) findViewById(R.id.imgAdvanced1);
        imgLvl2=(ImageView) findViewById(R.id.imgAdvanced2);
        imgLvl3=(ImageView) findViewById(R.id.imgAdvanced3);
        AdvLvl=(Button) findViewById(R.id.AdvancedLvl);

        //the editTexts for the user to enter the answer
        userAnswer1=(EditText) findViewById(R.id.advancedLvlEdit);
        userAnswer2=(EditText) findViewById(R.id.advancedLvlEdit2);
        userAnswer3=(EditText) findViewById(R.id.advancedLvlEdit3);

        int threeCars2[] = {R.drawable.audi_1, R.drawable.audi_2, R.drawable.audi_3, R.drawable.audi_4, R.drawable.audi_5, R.drawable.bmw_1,
                R.drawable.bmw_2, R.drawable.bmw_3, R.drawable.bmw_4, R.drawable.bmw_5, R.drawable.ferrari_1, R.drawable.ferrari_2, R.drawable.ferrari_3,
                R.drawable.ferrari_4, R.drawable.ferrari_5, R.drawable.ford_1, R.drawable.ford_2, R.drawable.ford_3, R.drawable.ford_4, R.drawable.ford_5, R.drawable.lambo_1,
                R.drawable.lambo_2, R.drawable.lambo_3, R.drawable.lambo_4, R.drawable.lambo_5, R.drawable.porsche_1, R.drawable.porsche_2, R.drawable.porsche_3, R.drawable.porsche_4, R.drawable.porsche_5};

     //   String[] carTypeSelect = {"Audi", "BMW", "Ferrari", "Ford", "Lamborghini", "Porsche"};

        //generating three random numbers for the three images whose positions in the array are below 9,19 and 29 respectively
        int randomCarOneAdv = AdvancedR.nextInt(9);
        int randomCarTwoAdv = AdvancedR.nextInt(9)+10;
        int randomCarThreeAdv = AdvancedR.nextInt(9)+20;

    //setting the three images from the positions picked through the randomly generated numbers to the imageViews
        imgLvl1.setImageResource(threeCars2[randomCarOneAdv]);
        imgLvl2.setImageResource(threeCars2[randomCarTwoAdv]);
        imgLvl3.setImageResource(threeCars2[randomCarThreeAdv]);

    AdvLvl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //to convert letters of answers to uppercase if they are entered in lowercase
            userAnswer1toStr = userAnswer1.getText().toString().toUpperCase();
            userAnswer2toStr = userAnswer2.getText().toString().toUpperCase();
            userAnswer3toStr = userAnswer3.getText().toString().toUpperCase();

            //if the randomly generated first number is below or equal to 4 and the text entered is audi answer is correct or else wrong
            if (randomCarOneAdv <= 4 ) {
                if (userAnswer1toStr.equals("AUDI")) {
                    userAnswer1.setTextColor(Color.GREEN);
                    userAnswer1.setText(userAnswer1toStr);
                    userAnswer1.setEnabled(false);
                } else {
                    userAnswer1.setText(userAnswer1toStr);
                    userAnswer1.setTextColor(Color.RED);

                }

            }
            if (randomCarOneAdv > 4 && randomCarOneAdv <= 9 ) {
                if (userAnswer1toStr.equals("BMW")) {
                    userAnswer1.setTextColor(Color.GREEN);
                    userAnswer1.setText(userAnswer1toStr);
                    userAnswer1.setEnabled(false);
                } else {
                    userAnswer1.setText(userAnswer1toStr);
                    userAnswer1.setTextColor(Color.RED);

                }
            }
            if (randomCarTwoAdv > 9 && randomCarTwoAdv <= 14 ) {

                if (userAnswer2toStr.equals("FERRARI")) {
                    userAnswer2.setTextColor(Color.GREEN);
                    userAnswer2.setText(userAnswer2toStr);
                    userAnswer2.setEnabled(false);
                } else {
                    userAnswer2.setText(userAnswer2toStr);
                    userAnswer2.setTextColor(Color.RED);

                }
            }
            if (randomCarTwoAdv > 14 && randomCarTwoAdv <= 19 ) {
                if (userAnswer2toStr.equals("FORD")) {
                    userAnswer2.setTextColor(Color.GREEN);
                    userAnswer2.setText(userAnswer2toStr);
                    userAnswer2.setEnabled(false);
                } else {
                    userAnswer2.setText(userAnswer2toStr);
                    userAnswer2.setTextColor(Color.RED);

                }
            }
            if (randomCarThreeAdv > 19 && randomCarThreeAdv <= 24 ) {
                if (userAnswer3toStr.equals("LAMBORGHINI")) {
                    userAnswer3.setTextColor(Color.GREEN);
                    userAnswer3.setText(userAnswer3toStr);
                    userAnswer3.setEnabled(false);
                } else {
                    userAnswer3.setText(userAnswer3toStr);
                    userAnswer3.setTextColor(Color.RED);

                }
            }
            if (randomCarThreeAdv > 24 && randomCarThreeAdv <= 29 ) {
                if (userAnswer3toStr.equals("PORSCHE")) {
                    userAnswer3.setTextColor(Color.GREEN);
                    userAnswer3.setText(userAnswer3toStr);
                    userAnswer3.setEnabled(false);
                } else {
                    userAnswer3.setText(userAnswer3toStr);
                    userAnswer3.setTextColor(Color.RED);

                }
            }
        }

    });
    }


    }
