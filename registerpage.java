package com.example.beubehuman;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class registerpage extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    EditText vemail,vpass,Donar_name,Mob_NO,Address,Height,Weight;
    //RadioButton Male,Female,Transgender;
    String email,pass,dname,dmob_no,daddr,dheight,dweight;
    String emailpattern= "[a-zA-z0-9,_-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);
        vemail= findViewById(R.id.vemail);
        vpass= findViewById(R.id.vpass);
        Donar_name= findViewById(R.id.Donar_name);
        Mob_NO= findViewById(R.id.Mob_No);
        Address= findViewById(R.id.Address);
        Height= findViewById(R.id.Height);
        Weight= findViewById(R.id.Weight);

        Button submit=(Button) findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email= vemail.getText().toString();
                pass=vpass.getText().toString();
                dname= Donar_name.getText().toString();
                dmob_no= Mob_NO.getText().toString();
                daddr= Address.getText().toString();
                dheight= Height.getText().toString();
                dweight= Weight.getText().toString();

                if(email.isEmpty()) {
                    Toast.makeText(registerpage.this, "Enter Email-Id", Toast.LENGTH_SHORT).show();
                }else if (!email.matches(emailpattern)){
                    Toast.makeText(registerpage.this,"Enter Valid Email-Id",Toast.LENGTH_SHORT).show();
                }else if(pass.isEmpty()){
                    Toast.makeText(registerpage.this,"Enter Password",Toast.LENGTH_SHORT).show();
                }else if (pass.length()<8){
                    Toast.makeText(registerpage.this,"Enter 8 Digit Password",Toast.LENGTH_SHORT).show();
                }else if(dname.isEmpty()){
                    Toast.makeText(registerpage.this, "Enter Name", Toast.LENGTH_SHORT).show();
                }else if(dmob_no.isEmpty()){
                    Toast.makeText(registerpage.this, "Enter Mobile Number", Toast.LENGTH_SHORT).show();
                }else if (daddr.isEmpty()){
                    Toast.makeText(registerpage.this, "Enter Address", Toast.LENGTH_SHORT).show();
                }else if (dweight.isEmpty()){
                    Toast.makeText(registerpage.this, "Enter Weight", Toast.LENGTH_SHORT).show();
                }else if (dheight.isEmpty()){
                    Toast.makeText(registerpage.this, "Enter Height", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Spinner mySpinner=(Spinner)findViewById(R.id.spinner2); //Bloodgroup
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(registerpage.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.BloodGroup2));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Button button= (Button) findViewById(R.id.DOBbutton); //Calender
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker= new Donar_DOB();
                datePicker.show(getSupportFragmentManager(), "DOB");
            }

        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        Calendar c= Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DAY_OF_MONTH,dayOfMonth);

        String currentDateString= DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView textView= (TextView) findViewById(R.id.DOBbutton);
        textView.setText(currentDateString);


    }
}
