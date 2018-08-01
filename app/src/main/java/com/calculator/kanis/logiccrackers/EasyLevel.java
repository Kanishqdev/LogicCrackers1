package com.calculator.kanis.logiccrackers;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by kanis on 26-02-2018.
 */

public class EasyLevel extends AppCompatActivity implements View.OnClickListener {
    Button submit1;
    EditText code1;
   protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        super.setContentView(R.layout.easy_layout_rules);
        submit1=(Button)findViewById(R.id.submit1);
        code1=(EditText)findViewById(R.id.code1);
        submit1.setOnClickListener(this);}
    @Override
    public void onClick(View v) {
       if(code1.getText().toString().equals("D52Y")){
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   Intent i = new Intent(EasyLevel.this, Easy_sets.class);
                   startActivity(i);
                   finish();
               }
           }, 100);

       }
       else{
           Toast.makeText(this,"U have entered the wrong code",Toast.LENGTH_SHORT).show();

       }

    }
}