package com.example.zelmad.hiddenfounderscodingchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by zelmad on 18/01/2018.
 */

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    private ImageView logo;
    Animation logoAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // set logo_animation
        logo = (ImageView) findViewById(R.id.logo);
        logoAnimation = AnimationUtils.loadAnimation(this,R.anim.logo_animation);
        logo.startAnimation(logoAnimation);

        new Handler().postDelayed(new Runnable() {
            /*
             * Showing splash screen with a timer.
             */
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }