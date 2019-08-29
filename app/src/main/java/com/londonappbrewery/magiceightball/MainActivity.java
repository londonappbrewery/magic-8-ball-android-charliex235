package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballImage = findViewById(R.id.imageBall);
        Button ballButton2 = findViewById(R.id.ballButtom);
        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        ballButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNum = new Random();
                int number = randomNum.nextInt(5);
                int imageResourceID = ballArray[number];
                ballImage.setImageResource(imageResourceID);

            }
        });
    }
}
