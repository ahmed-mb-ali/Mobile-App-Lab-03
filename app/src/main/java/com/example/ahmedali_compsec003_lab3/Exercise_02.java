package com.example.ahmedali_compsec003_lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Exercise_02 extends AppCompatActivity {

    AnimationDrawable mframeAnimation = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_02);
    }

    // Handle Start Button
    public void ButtonStart(View view) {
        startAnimation();
    }

    // Handle Stop Button
    public void ButtonStop(View view) {
        stopAnimation();
    }

    // StartAnimation Method
    private void startAnimation()
    {
        ImageView img = (ImageView)findViewById(R.id.imageViewEagle);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_1);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_2);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_3);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_4);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_5);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_6);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_7);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_8);
        BitmapDrawable frame9 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_9);
        BitmapDrawable frame10 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_10);
        BitmapDrawable frame11 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_11);
        BitmapDrawable frame12 = (BitmapDrawable)getResources().getDrawable(R.drawable.eagle_12);

        // Get the background, which has been compiled to an AnimationDrawable object.
        int reasonableDuration = 150;
        mframeAnimation = new AnimationDrawable();
        mframeAnimation.setOneShot(false);	// loop continuously
        mframeAnimation.addFrame(frame1, reasonableDuration);
        mframeAnimation.addFrame(frame2, reasonableDuration);
        mframeAnimation.addFrame(frame3, reasonableDuration);
        mframeAnimation.addFrame(frame4, reasonableDuration);
        mframeAnimation.addFrame(frame5, reasonableDuration);
        mframeAnimation.addFrame(frame6, reasonableDuration);
        mframeAnimation.addFrame(frame7, reasonableDuration);
        mframeAnimation.addFrame(frame8, reasonableDuration);
        mframeAnimation.addFrame(frame9, reasonableDuration);
        mframeAnimation.addFrame(frame10, reasonableDuration);
        mframeAnimation.addFrame(frame11, reasonableDuration);
        mframeAnimation.addFrame(frame12, reasonableDuration);

        img.setBackground(mframeAnimation);

        mframeAnimation.setVisible(true,true);
        mframeAnimation.start();
    }// end method

    // StopAnimation Method
    private void stopAnimation()
    {
        mframeAnimation.stop();
        mframeAnimation.setVisible(false,false);

    } // end method

} // end class
