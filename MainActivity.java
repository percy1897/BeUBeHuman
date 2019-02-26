package com.example.beubehuman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.btone); //request_button
        bt1.setOnClickListener(this);

        bt2=(Button)findViewById(R.id.bttwo); //regiter_button
        bt2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

       switch(v.getId()) {
           case R.id.btone:
               Intent intent = new Intent(MainActivity.this, requestpage.class);
               startActivity(intent);
               break;

           case R.id.bttwo:
               Intent intent1 = new Intent(MainActivity.this, registerpage.class);
               startActivity(intent1);
               break;
       }
    }
}
