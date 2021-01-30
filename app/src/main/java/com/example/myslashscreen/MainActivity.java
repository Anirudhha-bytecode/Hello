package com.example.myslashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import static com.example.myslashscreen.R.id.progressbar;

public class MainActivity extends AppCompatActivity {

    int progress;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=(ProgressBar) findViewById(progressbar);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        thread.start();
    }
    public void doWork() {
       for(progress=1;progress<=100;progress=progress+1)
       {
          try{
              Thread.sleep(1000);
              progressBar.setProgress(progress);
          }
          catch (Exception e)
          {

          }
       }
    }
}