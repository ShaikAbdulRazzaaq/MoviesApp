package com.tutorials.movies_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Handler handler = new Handler(Looper.getMainLooper());
    private Launcher launcher = new Launcher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        handler.postDelayed(launcher, 3000);
    }

    @Override
    protected void onStop() {
        handler.removeCallbacks(launcher);
        super.onStop();
    }

    private void launch() {
        if (!isFinishing()) {
            Log.d(TAG, "launch: splash screen is running");
            startActivity(new Intent(MainActivity.this, Welcome.class));
        }
    }

    private class Launcher implements Runnable {

        @Override
        public void run() {
            launch();
        }

    }
}