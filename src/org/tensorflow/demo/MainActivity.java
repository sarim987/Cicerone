package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //start font
        TextView tx = (TextView)findViewById(R.id.logo);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "font/carter_one.ttf");

        tx.setTypeface(custom_font);
        //end font


        final Button buttonCam;
        buttonCam = (Button) findViewById(R.id.startBtn);
        buttonCam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(getApplicationContext(), DetectorActivity.class);
                startActivity(i);
            }
        });

        final Button buttonSettings;
        buttonSettings = (Button) findViewById(R.id.settingsBtn);
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(i);
            }
        });

        ImageView splash = (ImageView) findViewById(R.id.imageView4);

        RotateAnimation anim = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.setDuration(6000);

        // Start animating the image

        splash.startAnimation(anim);



    }




}
