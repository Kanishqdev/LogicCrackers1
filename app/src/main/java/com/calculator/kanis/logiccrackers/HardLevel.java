package com.calculator.kanis.logiccrackers;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by kanis on 26-02-2018.
 */

public class HardLevel extends AppCompatActivity implements View.OnClickListener {
    EditText code2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        super.setContentView(R.layout.hard_layout_rules);
        code2=(EditText)findViewById(R.id.code2);
        btn1=(Button)findViewById(R.id.submit2);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(code2.getText().toString().equals("78A4")){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(HardLevel.this, hardsets.class);
                    startActivity(i);
                    finish();
                }
            }, 1);

        }
        else{
            Toast.makeText(this,"U have entered the wrong code",Toast.LENGTH_SHORT).show();

        }
        }
    }

