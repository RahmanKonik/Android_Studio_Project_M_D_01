package com.example.weatherapp2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openForecastActivity(View view) {

        Intent openForecast = new Intent(this,ForecastActivity.class);
        openForecast.putExtra("CITY_NAME","Tampere");
        openForecast.putExtra("HOW_MANY_DAYS",5);
        startActivity(openForecast);
    }

    public void refreshData(View view) {
    }
}