package com.example.user.studentfacultyapplication.activities;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

import com.example.user.studentfacultyapplication.R;

import static java.lang.Thread.sleep;

public class HomeActivity extends Activity {

    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}

