package com.example.coursework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CarImage extends AppCompatActivity {

    ImageView imgCar1;
    ImageView imgCar2;
    ImageView imgCar3;
    TextView CarNameText;
    TextView NameIdentify;
    String carTypeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_image);

        imgCar1 = (ImageView) findViewById(R.id.car_img1);
        imgCar2 = (ImageView) findViewById(R.id.car_img2);
        imgCar3 = (ImageView) findViewById(R.id.car_img3);
        Button IdentifyImage = findViewById(R.id.button_carImg);
        CarNameText = (TextView) findViewById(R.id.carOneText);
        NameIdentify = (TextView) findViewById(R.id.carTwoText);
        carTypeName=(String) CarNameText.getText();

        //CarImages

        int  threeCars[] = {R.drawable.audi_1, R.drawable.audi_2, R.drawable.audi_3, R.drawable.audi_4, R.drawable.audi_5, R.drawable.bmw_1,
                R.drawable.bmw_2, R.drawable.bmw_3, R.drawable.bmw_4, R.drawable.bmw_5, R.drawable.ferrari_1, R.drawable.ferrari_2, R.drawable.ferrari_3,
                R.drawable.ferrari_4, R.drawable.ferrari_5, R.drawable.ford_1, R.drawable.ford_2, R.drawable.ford_3, R.drawable.ford_4, R.drawable.ford_5, R.drawable.lambo_1,
                R.drawable.lambo_2, R.drawable.lambo_3, R.drawable.lambo_4, R.drawable.lambo_5, R.drawable.porsche_1, R.drawable.porsche_2, R.drawable.porsche_3, R.drawable.porsche_4, R.drawable.porsche_5};

        //CarNames

        String[] carTypeSelect = {"Audi", "BMW", "Ferrari", "Ford", "Lamborghini", "Porsche"};


        Random carTypesImage = new Random();

        //three random numbers selected from 0 to 9,10 to 19 and 19 to 29
        int randomCarOne = carTypesImage.nextInt(9);
        int randomCarTwo = randomCarOne + 10;
        int randomCarThree = randomCarTwo + 10;


       //set each imageView with images from the array at the position of each random number
        imgCar1.setImageResource(threeCars[randomCarOne]);
        imgCar2.setImageResource(threeCars[randomCarTwo]);
        imgCar3.setImageResource(threeCars[randomCarThree]);
        CarNameText.setText("");
        NameIdentify.setText("");


        //if the random number of the position of the image of the third imageView is between 20 and 24
        // the textview will be set to display the 4th element  in the array of car names if not it will be set to display the 5th
        if (randomCarThree <= 4) {
            carTypeName = carTypeSelect[0];
            CarNameText.setText(carTypeName);
        } else if (randomCarThree > 4 && randomCarThree <= 9) {
            carTypeName = carTypeSelect[1];
            CarNameText.setText(carTypeName);
        } else if (randomCarThree > 9 && randomCarThree <= 14) {
            carTypeName = carTypeSelect[2];
            CarNameText.setText(carTypeName);
        } else if (randomCarThree > 14 && randomCarThree <= 19) {
            carTypeName = carTypeSelect[3];
            CarNameText.setText(carTypeName);
        } else if (randomCarThree > 19 && randomCarThree <= 24) {
            carTypeName = carTypeSelect[4];
            CarNameText.setText(carTypeName);
        } else if (randomCarThree > 24 && randomCarThree <= 29) {
            carTypeName = carTypeSelect[5];
            CarNameText.setText(carTypeName);
        }
        //if the position of the image is less than or equal to 4 and the name displayed in the textView
        // is the first element of the carName array set the color of the text to green and set the text correct in the bottom textView
        //else set the color of the text to red and the text wrong in the bottom textView

        //if the position of the image is between 4 and 9 and the name displayed in the textView
        //is the second element of the carName array set the color of the text to green and set the text correct in the bottom textView
        //else set the color of the text to red and the text wrong in the bottom textView
        imgCar1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                NameIdentify.setText("");


                if (randomCarOne <= 4) {
                    if (carTypeName.equals("Audi")) {
                        NameIdentify.setTextColor(Color.GREEN);
                        NameIdentify.setText("Correct");
                    } else {
                        NameIdentify.setTextColor(Color.RED);
                        NameIdentify.setText("Wrong");
                    }

                }
                if (randomCarOne > 4 && randomCarOne <= 9) {
                    if (carTypeName.equals("BMW")) {
                        NameIdentify.setTextColor(Color.GREEN);
                        NameIdentify.setText("Correct");
                    } else {

                        NameIdentify.setTextColor(Color.RED);
                        NameIdentify.setText("Wrong");
                    }

                }

            }
        });
        //if the position of the image is between 9 and 14 and the name displayed in the textView
        // is the third element of the carName array set the color of the text to green and set the text correct in the bottom textView
        //else set the color of the text to red and the text wrong in the bottom textView

        //if the position of the image is between 14 and 19 and the name displayed in the textView
        //is the fourth element of the carName array set the color of the text to green and set the text correct in the bottom textView
        //else set the color of the text to red and the text wrong in the bottom textView

        imgCar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randomCarTwo > 9 && randomCarTwo <= 14) {
                    if (carTypeName.equals("Ferrari")) {
                        NameIdentify.setTextColor(Color.GREEN);
                        NameIdentify.setText("Correct");
                    } else {
                        NameIdentify.setTextColor(Color.RED);
                        NameIdentify.setText("Wrong");
                    }
                }
                if (randomCarTwo > 14 && randomCarTwo <= 19) {
                    if (carTypeName == "Ford") {
                        NameIdentify.setTextColor(Color.GREEN);
                        NameIdentify.setText("Correct");
                    } else {
                        NameIdentify.setTextColor(Color.RED);
                        NameIdentify.setText("Wrong");
                    }

                }

            }
        });
        //if the position of the image is between 19 and 24 and the name displayed in the textView
        // is the fifth element of the carName array set the color of the text to green and set the text correct in the bottom textView
        //else set the color of the text to red and the text wrong in the bottom textView

        //if the position of the image is between 24 and 29 and the name displayed in the textView
        //is the sixth element of the carName array set the color of the text to green and set the text correct in the bottom textView
        //else set the color of the text to red and the text wrong in the bottom textView

        imgCar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randomCarThree > 19 && randomCarThree <= 24) {
                    if (carTypeName.equals("Lamborghini")) {
                        NameIdentify.setTextColor(Color.GREEN);
                        NameIdentify.setText("Correct");
                    } else {
                        NameIdentify.setTextColor(Color.RED);
                        NameIdentify.setText("Wrong");
                    }

                }
                if (randomCarThree > 24 && randomCarThree <= 29) {
                    if (carTypeName.equals("Porsche")) {
                        NameIdentify.setTextColor(Color.GREEN);
                        NameIdentify.setText("Correct");
                    } else {
                        NameIdentify.setTextColor(Color.RED);
                        NameIdentify.setText("Wrong");
                    }

                }

            }
        });
        IdentifyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomCarOne = carTypesImage.nextInt(9);
                int randomCarTwo = randomCarOne + 10;
                int randomCarThree = randomCarTwo + 10;
                int randomFourth = carTypesImage.nextInt(3);

                imgCar1.setImageResource(threeCars[randomCarOne]);
                imgCar2.setImageResource(threeCars[randomCarTwo]);
                imgCar3.setImageResource(threeCars[randomCarThree]);
                NameIdentify.setText("");

                if(randomFourth==0){
                    if (randomCarOne <= 4) {
                        carTypeName = carTypeSelect[0];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarOne > 4 && randomCarOne <= 9) {
                        carTypeName = carTypeSelect[1];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarOne > 9 && randomCarOne <= 14) {
                        carTypeName = carTypeSelect[2];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarOne > 14 && randomCarOne <= 19) {
                        carTypeName = carTypeSelect[3];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarOne > 19 && randomCarOne <= 24) {
                        carTypeName = carTypeSelect[4];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarOne > 24 && randomCarOne <= 29) {
                        carTypeName = carTypeSelect[5];
                        CarNameText.setText(carTypeName);
                    }

                }
                if(randomFourth==1){
                    if (randomCarTwo <= 4) {
                        carTypeName = carTypeSelect[0];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarTwo > 4 && randomCarTwo <= 9) {
                        carTypeName = carTypeSelect[1];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarTwo > 9 && randomCarTwo <= 14) {
                        carTypeName = carTypeSelect[2];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarTwo > 14 && randomCarTwo <= 19) {
                        carTypeName = carTypeSelect[3];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarTwo > 19 && randomCarTwo <= 24) {
                        carTypeName = carTypeSelect[4];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarTwo > 24 && randomCarTwo <= 29) {
                        carTypeName = carTypeSelect[5];
                        CarNameText.setText(carTypeName);
                    }
                }
                if(randomFourth==2){
                    if (randomCarThree <= 4) {
                        carTypeName = carTypeSelect[0];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarThree > 4 && randomCarThree <= 9) {
                        carTypeName = carTypeSelect[1];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarThree > 9 && randomCarThree <= 14) {
                        carTypeName = carTypeSelect[2];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarThree > 14 && randomCarThree <= 19) {
                        carTypeName = carTypeSelect[3];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarThree > 19 && randomCarThree <= 24) {
                        carTypeName = carTypeSelect[4];
                        CarNameText.setText(carTypeName);
                    } else if (randomCarThree > 24 && randomCarThree <= 29) {
                        carTypeName = carTypeSelect[5];
                        CarNameText.setText(carTypeName);
                    }
                }

                carTypeName=(String) CarNameText.getText();
                imgCar1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        NameIdentify.setText("");
                        if (randomCarOne <= 4) {
                            if (carTypeName.equals("Audi")) {
                                NameIdentify.setTextColor(Color.GREEN);
                                NameIdentify.setText("Correct");
                            } else {
                                NameIdentify.setTextColor(Color.RED);
                                NameIdentify.setText("Wrong");
                            }

                        }
                        if (randomCarOne > 4 && randomCarOne <= 9) {
                            if (carTypeName.equals("BMW")) {
                                NameIdentify.setTextColor(Color.GREEN);
                                NameIdentify.setText("Correct");
                            } else {
                                NameIdentify.setTextColor(Color.RED);
                                NameIdentify.setText("Wrong");
                            }

                        }

                    }
                });

                imgCar2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (randomCarTwo > 9 && randomCarTwo <= 14) {
                            if (carTypeName.equals("Ferrari")) {
                                NameIdentify.setTextColor(Color.GREEN);
                                NameIdentify.setText("Correct");
                            } else {
                                NameIdentify.setTextColor(Color.RED);
                                NameIdentify.setText("Wrong");
                            }
                        }
                        if (randomCarTwo > 14 && randomCarTwo <= 19) {
                            if (carTypeName == "Ford") {
                                NameIdentify.setTextColor(Color.GREEN);
                                NameIdentify.setText("Correct");
                            } else {
                                NameIdentify.setTextColor(Color.RED);
                                NameIdentify.setText("Wrong");
                            }

                        }

                    }
                });

                imgCar3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (randomCarThree > 19 && randomCarThree <= 24) {
                            if (carTypeName.equals("Lamborghini")) {
                                NameIdentify.setTextColor(Color.GREEN);
                                NameIdentify.setText("Correct");
                            } else {
                                NameIdentify.setTextColor(Color.RED);
                                NameIdentify.setText("Wrong");
                            }

                        }
                        if (randomCarThree > 24 && randomCarThree <= 29) {
                            if (carTypeName.equals("Porsche")) {
                                NameIdentify.setTextColor(Color.GREEN);
                                NameIdentify.setText("Correct");
                            } else {
                                NameIdentify.setTextColor(Color.RED);
                                NameIdentify.setText("Wrong");
                            }

                        }

                    }
                });

            }
        });
    }
}