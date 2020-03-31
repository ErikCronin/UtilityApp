package com.derk.utilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Settings extends AppCompatActivity {

    // Settings controls home location, which affects home currency

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        String[] users = { "Australia", "United States", "Japan", "United Kingdom", "France" };
        Spinner spin = (Spinner) findViewById(R.id.homeSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        spin.setAdapter(adapter);
    }

    public void saveClicked(View view){
        finish();
    }


}
