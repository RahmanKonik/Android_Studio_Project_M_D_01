package com.example.weatherapp2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ForecastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        Intent intent = new Intent();

        String cityName = intent.getStringExtra("CITY_NAME");
        String somethingNotThere = intent.getStringExtra("NOT_THERE");
        int howManyDays = intent.getIntExtra("HOW_MANY_DAYS",6);

        TextView forecastHeaderTextView = findViewById(R.id.forecastHeaderTextView);

        if( cityName != null){
            forecastHeaderTextView.setText(cityName);
        }else{
            forecastHeaderTextView.setText(R.string.STRING_UNKNOWN_CITY);
        }
    }

    public void openMainActivity(View view) {

        Intent openMain = new Intent(this, MainActivity.class);
        startActivity(openMain);
    }
}