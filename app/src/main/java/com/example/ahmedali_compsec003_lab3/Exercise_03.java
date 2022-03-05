package com.example.ahmedali_compsec003_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Exercise_03 extends AppCompatActivity {

    //Declare variables
    ImageView moonImage, earthImage;
    Button startBtn, stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_03);

        moonImage = (ImageView) findViewById(R.id.imageEarth);
        earthImage = (ImageView) findViewById(R.id.imageMoon);
        startBtn = (Button) findViewById(R.id.buttonStart);
        stopBtn = (Button) findViewById(R.id.buttonStop);


        // Handle Start button
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performAnimationMoon(R.anim.moon);
                performAnimationEarth(R.anim.earth);
            }
        });

        // Handle Stop button
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moonImage.clearAnimation();
                earthImage.clearAnimation();
            }
        });

    }// end method

    // performAnimationMoon method
    public void performAnimationMoon(int animationResourceID)
    {
        // animate the imageView
        moonImage.setImageResource(R.drawable.moon);
        moonImage.setVisibility(View.VISIBLE);

        // load the appropriate animation
        Animation animate = AnimationUtils.loadAnimation(this, animationResourceID);
        // Start the animation
        moonImage.startAnimation(animate);

    }// end method

    // performAnimationEarth method
    public void performAnimationEarth(int animationResourceID)
    {
        // animate the imageView
        earthImage.setImageResource(R.drawable.earth);
        earthImage.setVisibility(View.VISIBLE);

        // load the appropriate animation
        Animation earth = AnimationUtils.loadAnimation(this, animationResourceID);
        // Start the animation
        earthImage.startAnimation(earth);

    }// end method
}// end class