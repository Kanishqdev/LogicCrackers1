package com.calculator.kanis.logiccrackers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.Date;

public class hardgame extends AppCompatActivity implements View.OnClickListener {
    int k=0;
    int i;
    int score5 = 0;

    Integer[] x0 = {R.drawable.r2c1,R.drawable.r2c2,R.drawable.r2c3,R.drawable.r2c4,R.drawable.r2c5,R.drawable.r2c6,R.drawable.r2c7,R.drawable.r2c8,R.drawable.r2c9,R.drawable.r2c10,};
    String[] y0 = {"0110","0000","1001","1111","0001","1001","0001","0001","0111","1000"};
    Button subm;
    EditText o1,o2,o3,o4;
    ImageView img2;
    long start= new Date().getTime();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        i=Integer.parseInt(getIntent().getStringExtra("index"));
        k=i;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardgame);
        subm=(Button)findViewById(R.id.sub);
        o1=(EditText)findViewById(R.id.edity0);
        o2=(EditText)findViewById(R.id.edit1);
        img2=(ImageView)findViewById(R.id.cir2);
        o3=(EditText)findViewById(R.id.edit2);
        o4=(EditText)findViewById(R.id.edit3);
        if(k==i)
            img2.setImageResource(x0[i]);
        subm.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (y0[k].equals(o1.getText().toString() + o2.getText().toString() + o3.getText().toString()+o4.getText().toString()))
            score5++;
        k++;
        if(k!=i+5) {
            img2.setImageResource(x0[k]);
            o1.setText("");
            o2.setText("");
            o3.setText("");
            o4.setText("");
        }
        else{
            long elapsed=(new Date().getTime())-start;
            Intent intent = new Intent(hardgame.this, finalScore.class);
            intent.putExtra("score",Integer.toString(score5));
            intent.putExtra("Time",Long.toString(elapsed/60000));
            startActivity(intent);
        }


    }

}

