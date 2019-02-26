package com.example.beubehuman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class requestpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requestpage);

        Spinner mySpinner=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(requestpage.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BloodGroup));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }
}
