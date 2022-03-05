package com.example.ahmedali_compsec003_lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Exercise_01 extends AppCompatActivity {

    //Declare variables
    private ImageView reusableImageView;
    private int startx = 20;
    private int starty = 20;
    private int endx;
    private int endy;
    private Paint paint;
    private Bitmap bitmap;
    private Canvas canvas;
    //Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_01);
        //create the paint for our drawings
        paint = new Paint();
        paint.setColor(Color.RED);
        //paint.setStrokeMiter((float)0.5);
        paint.setStrokeWidth(30);

        //creating a bitmap as content view for the image
        bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        //tell canvas about the content view
        canvas = new Canvas(bitmap);
        //setup the image view
        reusableImageView = (ImageView)findViewById(R.id.ImageViewForDrawing);
        //tell image view for the bitmap format/content
        reusableImageView.setImageBitmap(bitmap);
        reusableImageView.setVisibility(View.VISIBLE);

        //Set up references to GUI view
        RadioButton RedButton = findViewById(R.id.Red);
        RadioButton YellowButton = findViewById(R.id.Yellow);
        RadioButton CyanButton = findViewById(R.id.Cyan);
        RadioGroup LineThickness = findViewById(R.id.radioGroupLine);

        //Set onClickListener RadioGroup button
        LineThickness.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton thick_60 = findViewById(R.id.LineThick60);
                RadioButton thick_80 = findViewById(R.id.LineThick80);
                RadioButton thick_100 = findViewById(R.id.LineThick100);

                if(thick_60.isChecked())
                {
                    paint.setStrokeWidth(60);
                }
                if(thick_80.isChecked())
                {
                    paint.setStrokeWidth(80);
                }
                if(thick_100.isChecked())
                {
                    paint.setStrokeWidth(100);
                }
            }
        });

        //Set onClickListener Red Button
        RedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paint.setColor(getResources().getColor(R.color.red));
            }
        });

        //Set onClickListener Yellow Button
        YellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paint.setColor(getResources().getColor(R.color.yellow));
            }
        });

        //Set onClickListener Cyan Button
        CyanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paint.setColor(getResources().getColor(R.color.cyan));
            }
        });

    }// end method

    // Clear Canvas Method
    public void clearCanvas(View v)
    {
        canvas.drawColor(Color.WHITE);
        startx = 10;
        starty = 10;
        endx = 0;
        endy = 0;

    }// end method

    // Button Up Method
    public void buttonUp (View view){
        endy = starty - 15;
        canvas.drawLine(startx, starty, endx, endy, paint);
        startx = endx;
        starty = endy;
    }// end method

    // Button Down Method
    public void buttonDown (View view){
        endy = starty + 50;
        canvas.drawLine(startx, starty, endx, endy, paint);
        startx = endx;
        starty = endy;
    }// end method

    // Button Right Method
    public void buttonRight (View view){
        endx = startx + 50;
        canvas.drawLine(startx, starty, endx, endy, paint);
        startx = endx;
        starty = endy;
    }// end method

    // Button Left Method
    public void buttonLeft (View view){
        endx = startx - 50;
        canvas.drawLine(startx, starty, endx, endy, paint);
        startx = endx;
        starty = endy;
    }// end method

}// end class