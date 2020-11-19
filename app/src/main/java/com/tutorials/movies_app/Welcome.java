package com.tutorials.movies_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tutorials.movies_app.databinding.ActivityWelcomeBinding;

public class Welcome extends AppCompatActivity {
    ActivityWelcomeBinding activityWelcomeBinding;
    MainFragment mainFragment = new MainFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityWelcomeBinding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(activityWelcomeBinding.getRoot());
        getSupportFragmentManager().beginTransaction().replace(activityWelcomeBinding.fragmentHolder.getId(), mainFragment).commit();
    }
}