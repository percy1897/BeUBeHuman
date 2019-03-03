package com.example.beubehuman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class registerpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);
        
        
        Spinner mySpinner=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(registerpage.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BloodGroup2));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }
}
