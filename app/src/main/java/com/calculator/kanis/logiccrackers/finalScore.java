package com.calculator.kanis.logiccrackers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kanis on 28-02-2018.
 */

public class finalScore extends AppCompatActivity {
    TextView scoretime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalflash);
        scoretime=(TextView)findViewById(R.id.score0);
        scoretime.setText("Score :"+getIntent().getStringExtra("score")+"\n"+"Time: "+getIntent().getStringExtra("Time")+"min");

    }
}
