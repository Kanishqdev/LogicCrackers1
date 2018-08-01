package com.calculator.kanis.logiccrackers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.Date;
/**
 * Created by kanis on 26-02-2018.
 */
public class EasyGame extends AppCompatActivity implements View.OnClickListener {
    Button next;
    EditText y1;
    String[] x = {"0","1","0","1","1","1","1","0","0","1","0","1","0","1","1","0","1","1","0","1","0","0","0","0","0","1","1","0","0","1","1","0","0","0","1","0","1","0","0","1"};
    Integer[] y = {R.drawable.r1c1_00,R.drawable.r1c2_00,R.drawable.r1c3_00,R.drawable.r1c4_00,R.drawable.r1c5_00,R.drawable.r1c6_00,R.drawable.r1c7_00,R.drawable.r1c8_00,R.drawable.r1c9_00,R.drawable.r1c10_00,R.drawable.r1c1_01,R.drawable.r1c2_01,R.drawable.r1c3_01,R.drawable.r1c4_01,R.drawable.r1c5_01,R.drawable.r1c6_01,R.drawable.r1c7_01,R.drawable.r1c8_01,R.drawable.r1c9_01,R.drawable.r1c10_01,R.drawable.r1c1_10,R.drawable.r1c2_10,R.drawable.r1c3_10,R.drawable.r1c4_10,R.drawable.r1c5_10,R.drawable.r1c6_10,R.drawable.r1c7_10,R.drawable.r1c8_10,R.drawable.r1c9_10,R.drawable.r1c10_10,R.drawable.r1c1_11,R.drawable.r1c2_11,R.drawable.r1c3_11,R.drawable.r1c4_11,R.drawable.r1c5_11,R.drawable.r1c6_11,R.drawable.r1c7_11,R.drawable.r1c8_11,R.drawable.r1c9_11,R.drawable.r1c10_11};
    ImageView cir1;
    long start=new Date().getTime();
    public int i = 0;
    public int k;
    public int score1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        k=Integer.parseInt(getIntent().getStringExtra("index"));
        i=k;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_game_layout);
        next = (Button) findViewById(R.id.next1);
        y1 = (EditText) findViewById(R.id.y1);
        cir1 = (ImageView) findViewById(R.id.cir);
        if(i==k)
        cir1.setImageResource(y[k]);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

            if (x[i].equals(y1.getText().toString()))
                score1++;
            i++;
            if(i!=k+10) {
                cir1.setImageResource(y[i]);
                y1.setText("");
            }
            else{
                long elapsed=(new Date().getTime())-start;
                Intent intent = new Intent(EasyGame.this, finalScore.class);
                intent.putExtra("score",Integer.toString(score1));
                intent.putExtra("Time",Long.toString(elapsed/1000));
                startActivity(intent);
            }


        }

}
