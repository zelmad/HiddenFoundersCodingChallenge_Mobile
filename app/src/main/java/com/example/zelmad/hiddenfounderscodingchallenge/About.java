package com.example.zelmad.hiddenfounderscodingchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by zelmad on 18/01/2018.
 */
public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View aboutPage = new AboutPage(this)
                .setDescription("The aim of this application is to list the most starred Github repos that were created in the last 30 days.\nHiddenfounders Coding Challenge\nPFE 2018")
                .isRTL(false)
                .addGroup("Connect us")
                .addEmail("zelmadmohamed1994@gmail.com")
                .addFacebook("mo zelmad")
                .addGitHub("zelmad")
                .create();

        setContentView(aboutPage);
    }
}
