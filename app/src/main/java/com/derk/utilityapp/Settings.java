package com.derk.utilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class Settings extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
    // Settings controls home location, which affects home currency
    public static String homeLocat = "United States";
    public String homeLocatMov = "United States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Spinner lspin = (Spinner) findViewById(R.id.localSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, MainActivity.locations);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lspin.setAdapter(adapter);
        lspin.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        homeLocatMov = MainActivity.locations[position];
        homeLocat = homeLocatMov;
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }

    public void saveClicked(View view){
        Toast.makeText(getApplicationContext(), "Home Currency saved to: " + homeLocat ,Toast.LENGTH_SHORT).show();
        finish();
    }


}
