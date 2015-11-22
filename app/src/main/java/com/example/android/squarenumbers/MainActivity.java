package com.example.android.squarenumbers;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText numberEditText;
    private Button squareButton;
    private String numberString;
    private int number;
    private int squareOfNumber;
    private SquareNumber squareNumber = new SquareNumber();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberEditText = (EditText) findViewById(R.id.numberEditText);
        squareButton = (Button) findViewById(R.id.squareButton);

        squareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberString = numberEditText.getText().toString();
                number = Integer.parseInt(numberString);
                squareOfNumber = squareNumber.getSquare(number);

                Toast msg = Toast.makeText(MainActivity.this, "The square of the number is " + squareOfNumber, Toast.LENGTH_LONG);
                msg.show();

            }
        });




    }





}
