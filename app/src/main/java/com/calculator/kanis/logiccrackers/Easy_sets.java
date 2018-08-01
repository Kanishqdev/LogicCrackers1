package com.calculator.kanis.logiccrackers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Easy_sets extends AppCompatActivity implements View.OnClickListener {
    Button sete1,sete2,sete3,sete4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_sets);
        sete1=(Button)findViewById(R.id.easyset1);
        sete2=(Button)findViewById(R.id.easyset2);
        sete3=(Button)findViewById(R.id.easyset3);
        sete4=(Button)findViewById(R.id.easyset4);
        sete1.setOnClickListener(this);
        sete2.setOnClickListener(this);
        sete3.setOnClickListener(this);
        sete4.setOnClickListener(this);

    }
    @Override

    public void onClick(View v) {
        Intent intent=new Intent(Easy_sets.this,EasyGame.class);
        switch (v.getId()){
            case R.id.easyset1:{
                intent.putExtra("index",Integer.toString(0));
                break;
            }
            case R.id.easyset2:{
                intent.putExtra("index",Integer.toString(10));
                break;
            }
            case R.id.easyset3:{
                intent.putExtra("index",Integer.toString(20));
                break;
            }
            default:{
                intent.putExtra("index",Integer.toString(30));
                break;
            }




        }
        startActivity(intent);

    }
}
