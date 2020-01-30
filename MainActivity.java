package com.example.miaohe_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    //buttons for number inputs
    Button zero,one,two,three,four,five,six,seven,eight,nine,add,minus,multiply,divide,equal,
    decimal,cancel;

    //edittext declare
    EditText editText;

    //we are only using two numbers for all of our implementations,namely valueone and valuetwo
    float valueone,valuetwo;

    //Avoid divided by zero problems, we here will check for calculation feasibility
    boolean ifaddition,ifsubtract,ifmult,ifdivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.division);
        equal = findViewById(R.id.equals);
        decimal = findViewById(R.id.decimal);
        cancel = findViewById(R.id.cancel);
        editText = findViewById(R.id.editText);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        //once a number button is clicked, we show this number on our "board"
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        //to check if there is valueone for calculation, if so clear the board wait for valuetwo
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueone = Float.parseFloat(editText.getText() + "");
                    ifaddition = true;
                    editText.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueone = Float.parseFloat(editText.getText() + "");
                    ifsubtract = true;
                    editText.setText(null);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueone = Float.parseFloat(editText.getText() + "");
                    ifmult = true;
                    editText.setText(null);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueone = Float.parseFloat(editText.getText() + "");
                    ifdivision = true;
                    editText.setText(null);
                }
            }
        });


        //do the calculation through equal
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuetwo = Float.parseFloat(editText.getText() + "");

                if (ifaddition) {
                    editText.setText(valueone + valuetwo + "");
                    ifaddition = false;
                }
                if (ifsubtract) {
                    editText.setText(valueone - valuetwo + "");
                    ifsubtract = false;
                }
                if (ifmult) {
                    editText.setText(valueone * valuetwo + "");
                    ifmult = false;
                }
                if (ifdivision) {
                    editText.setText(valueone / valuetwo + "");
                    ifdivision = false;
                }
            }
        });

    }
}
