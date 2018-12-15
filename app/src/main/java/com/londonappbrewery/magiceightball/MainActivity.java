package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eightBall = findViewById(R.id.magicEightBall);

        final int[] myArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final Button myButton = findViewById(R.id.askButton);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Magic_8_Ball", "Stop asking me! I don't know everything!");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                eightBall.setImageResource(myArray[number]);

            }
        });

    }
}
