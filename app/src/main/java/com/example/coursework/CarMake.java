package com.example.coursework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CarMake extends AppCompatActivity {
    ImageView img;
    ArrayAdapter<CharSequence> adapterCarMake;
    Spinner spinnerCarMake;
    TextView setTextMessage;
    TextView setCarName;

    //from the random number we can determine the type of car which was randomly inserted to the imageView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_make);

        img = (ImageView) findViewById(R.id.imageView);
        Button CarMake = (Button) findViewById(R.id.submit_button);
        spinnerCarMake = (Spinner) findViewById(R.id.label_spinner);
        adapterCarMake = ArrayAdapter.createFromResource(this, R.array.car_types, android.R.layout.simple_spinner_item);
        adapterCarMake.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCarMake.setAdapter(adapterCarMake);
        setTextMessage = (TextView) findViewById(R.id.messageText);
        setCarName = (TextView) findViewById(R.id.carNameIncorrect);

        //array of car images
        int cars[] = {R.drawable.audi_1, R.drawable.audi_2, R.drawable.audi_3, R.drawable.audi_4, R.drawable.audi_5, R.drawable.bmw_1,
                R.drawable.bmw_2, R.drawable.bmw_3, R.drawable.bmw_4, R.drawable.bmw_5, R.drawable.ferrari_1, R.drawable.ferrari_2, R.drawable.ferrari_3,
                R.drawable.ferrari_4, R.drawable.ferrari_5, R.drawable.ford_1, R.drawable.ford_2, R.drawable.ford_3, R.drawable.ford_4, R.drawable.ford_5, R.drawable.lambo_1,
                R.drawable.lambo_2, R.drawable.lambo_3, R.drawable.lambo_4, R.drawable.lambo_5, R.drawable.porsche_1, R.drawable.porsche_2, R.drawable.porsche_3, R.drawable.porsche_4, R.drawable.porsche_5};
        //the array Adapter to display the names of the options
        ArrayAdapter<String> adapterForCars = new ArrayAdapter<String>(CarMake.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.car_types));
        adapterForCars.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCarMake.setAdapter(adapterForCars);



        Random randomCarMake = new Random();
        CarMake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonNextMethod(CarMake);
                //select random number from 0 to length of array
                int carMakeNo = randomCarMake.nextInt(cars.length);
                //set the image from the car image array which is at the position of the random number to the imageView
                img.setImageResource(cars[carMakeNo]);
                spinnerCarMake.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                                             @Override
                                                             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                                 setTextMessage.setText("");
                                                                 setCarName.setText("");

                                                                 //if the random number is less than or equal to 4 and choice is selected as "audi"
                                                                 //which is the first position on the spinner the answer will be marked as correct or else wrong

                                                                 if (carMakeNo <= 4 && position == 0) {
                                                                     setTextMessage.setTextColor(Color.GREEN);
                                                                     setTextMessage.setText("CORRECT ");

                                                                 } else if (carMakeNo <= 4 && position != 0) {
                                                                     setTextMessage.setTextColor(Color.RED);
                                                                     setCarName.setTextColor(Color.YELLOW);
                                                                     setTextMessage.setText("WRONG ");
                                                                     setCarName.setText("Audi");

                                                                     //if the random number is between 5 and 9 and choice is selected as "bmw"
                                                                     //which is the second position on the spinner the answer will be marked as correct or else wrong

                                                                 } else if (carMakeNo > 5 && carMakeNo <= 9 && position == 1) {
                                                                     setTextMessage.setTextColor(Color.GREEN);
                                                                     setTextMessage.setText("CORRECT ");
                                                                 } else if (carMakeNo > 5 && carMakeNo <= 9 && position != 1) {
                                                                     setTextMessage.setTextColor(Color.RED);
                                                                     setCarName.setTextColor(Color.YELLOW);
                                                                     setTextMessage.setText("WRONG ");
                                                                     setCarName.setText("BMW");

                                                                     //if the random number is between 5 and 9 and choice is selected as "bmw"
                                                                     //which is the second position on the spinner the answer will be marked as correct or else wrong


                                                                 } else if (carMakeNo > 9 && carMakeNo <= 14 && position == 2) {

                                                                     setTextMessage.setTextColor(Color.GREEN);
                                                                     setTextMessage.setText("CORRECT");
                                                                 } else if (carMakeNo > 9 && carMakeNo <= 14 && position != 2) {
                                                                     setTextMessage.setTextColor(Color.RED);
                                                                     setCarName.setTextColor(Color.YELLOW);
                                                                     setTextMessage.setText("WRONG ");
                                                                     setCarName.setText("FERRARI");

                                                                 } else if (carMakeNo > 14 && carMakeNo <= 19 && position == 3) {
                                                                     setTextMessage.setTextColor(Color.GREEN);
                                                                     setTextMessage.setText("CORRECT");
                                                                 } else if (carMakeNo > 14 && carMakeNo <= 19 && position != 3) {
                                                                     setTextMessage.setTextColor(Color.RED);
                                                                     setCarName.setTextColor(Color.YELLOW);
                                                                     setTextMessage.setText("WRONG");
                                                                     setCarName.setText("FORD");

                                                                 } else if (carMakeNo > 19 && carMakeNo <= 24 && position == 4) {
                                                                     setTextMessage.setTextColor(Color.GREEN);
                                                                     setTextMessage.setText("CORRECT");
                                                                 } else if (carMakeNo > 19 && carMakeNo <= 24 && position != 4) {
                                                                     setTextMessage.setTextColor(Color.RED);
                                                                     setCarName.setTextColor(Color.YELLOW);
                                                                     setTextMessage.setText("WRONG ");
                                                                     setCarName.setText("LAMBORGHINI");

                                                                 } else if (carMakeNo > 24 && carMakeNo <= 29 && position == 5) {
                                                                     setTextMessage.setTextColor(Color.GREEN);
                                                                     setTextMessage.setText("CORRECT");
                                                                 } else if (carMakeNo > 24 && carMakeNo <= 29 && +position != 5) {
                                                                     setTextMessage.setTextColor(Color.RED);
                                                                     setCarName.setTextColor(Color.YELLOW);
                                                                     setTextMessage.setText("WRONG");
                                                                     setCarName.setText("PORSCHE");
                                                                 }
                                                             }

                                                             @Override
                                                             public void onNothingSelected(AdapterView<?> parent) {

                                                             }
                });
            }
                                   }
        );
    }
    public void ButtonNextMethod(View v){
        v.setEnabled(true);
        Button buttonNXT=(Button) v;
        buttonNXT.setText("NEXT");
        setTextMessage.setText("");
        setCarName.setText("");

    }
}


