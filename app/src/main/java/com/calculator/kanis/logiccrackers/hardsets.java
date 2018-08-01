package com.calculator.kanis.logiccrackers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hardsets extends AppCompatActivity implements View.OnClickListener {
    Button s1,s2;
    int k;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardsets);
 s1=(Button)findViewById(R.id.s1);
 s2=(Button)findViewById(R.id.s2);
 s1.setOnClickListener(this);
 s2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(hardsets.this,hardgame.class);
        if(v.getId()==R.id.s1){
            i.putExtra("index",Integer.toString(0));
        }
        else
            i.putExtra("index",Integer.toString(5));
        startActivity(i);
    }
}
