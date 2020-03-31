package com.derk.utilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] users = { "Australia", "United States", "Japan", "United Kingdom", "France" };
        Spinner spin = (Spinner) findViewById(R.id.localSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        spin.setAdapter(adapter);
    }

    public void settingsClicked(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void convertClicked(View view){

    }

    public void confirmClicked(View view){

    }
}
