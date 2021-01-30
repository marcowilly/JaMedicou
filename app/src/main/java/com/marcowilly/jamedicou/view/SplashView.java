package com.marcowilly.jamedicou.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.marcowilly.jamedicou.R;

public class SplashView extends AppCompatActivity {

    private ProgressBar pBarSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_view);
        pBarSplash = findViewById(R.id.progressBar);
        new Thread(new Runnable() {
            public void run() {
                doWork();
            }
        }).start();
    }

    private void doWork() {
        for (int progress = 0; progress < 100; progress += 25) {
            try {
                Thread.sleep(1000);
                pBarSplash.setProgress(progress);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Intent intent = new Intent(SplashView.this, MainView.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}