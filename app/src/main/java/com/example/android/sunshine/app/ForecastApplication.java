package com.example.android.sunshine.app;

import android.app.Application;

import com.example.android.sunshine.app.net.ForecastAPI;
import com.example.android.sunshine.app.net.ServiceGenerator;

/**
 * Created by tctkosen on 16/06/16.
 */
public class ForecastApplication extends Application{
    ForecastAPI forecastAPI;

    @Override
    public void onCreate() {
        super.onCreate();
        forecastAPI = ServiceGenerator.createService(ForecastAPI.class);
    }

    public ForecastAPI getForecastAPI() {
        return forecastAPI;
    }
}
