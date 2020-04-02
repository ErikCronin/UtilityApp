package com.derk.utilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String[] locations = { "United States", "Japan", "United Kingdom", "France" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void settingsClicked(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void convertClicked(View view){
        double sum;
        Button button = (Button) view;
        EditText hCurr = findViewById(R.id.homeCurrency);
        EditText lCurr = findViewById(R.id.localCurrency);

        double hConvtd = Double.parseDouble(hCurr.getText().toString());
        double lConvtd = Double.parseDouble(lCurr.getText().toString());
        String convType = button.getText().toString();
        System.out.println(convType);

        if (convType.equals("Convert To Local Currency")) {
            sum = hConvtd * 0.61;
            lCurr.setText(Double.toString(sum));
        } else if (convType.equals("Convert To Home Currency")) {
            sum = lConvtd * 1.61;
            hCurr.setText(Double.toString(sum));
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Skrrt";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void check(View view){
        Context context = getApplicationContext();
        CharSequence text = Settings.homeLocat;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
