package com.derk.utilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    @SuppressLint("SetTextI18n")
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
            switch (Settings.homeLocat) {
                case "United States":
                    sum = hConvtd * 0.61;
                    lCurr.setText(Double.toString(sum));
                    break;
                case "Japan":
                    sum = hConvtd * 65.35;
                    lCurr.setText(Double.toString(sum));
                    break;
                case "United Kingdom":
                    sum = hConvtd * 0.49;
                    lCurr.setText(Double.toString(sum));
                    break;
                case "France":
                    sum = hConvtd * 0.56;
                    lCurr.setText(Double.toString(sum));
                    break;
                default:
                    Context context = getApplicationContext();
                    CharSequence text = "Error";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    break;
            }
        } else if (convType.equals("Convert To Home Currency")) {
            switch (Settings.homeLocat) {
                case "United States":
                    sum = lConvtd / 0.61;
                    hCurr.setText(Double.toString(sum));
                    break;
                case "Japan":
                    sum = lConvtd / 65.35;
                    hCurr.setText(Double.toString(sum));
                    break;
                case "United Kingdom":
                    sum = lConvtd / 0.49;
                    hCurr.setText(Double.toString(sum));
                    break;
                case "France":
                    sum = lConvtd / 0.56;
                    hCurr.setText(Double.toString(sum));
                    break;
                default:
                    Context context = getApplicationContext();
                    CharSequence text = "Error";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    break;
            }
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Error";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

}
