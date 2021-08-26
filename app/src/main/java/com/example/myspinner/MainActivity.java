package com.example.myspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    public String City;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinnerId);



        final String[] options = getResources().getStringArray(R.array.City);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, options);
        spinner.setAdapter(adapter);
//
//ArrayAdapter<CharSequence> arrayAdapter =ArrayAdapter.createFromResource(this,R.array.City,android.R.layout.simple_spinner_item);
//
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//  spinner.setAdapter(arrayAdapter);

    }
}