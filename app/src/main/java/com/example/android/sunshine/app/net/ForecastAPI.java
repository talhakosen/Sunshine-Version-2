package com.example.android.sunshine.app.net;

import com.example.android.sunshine.app.modal.ForecastObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by tctkosen on 16/06/16.
 */
public interface ForecastAPI {
    @GET("data/2.5/forecast/daily")
    Call<List<ForecastObject>> loadWeather(@Query("q") String q, @Query("mode") String mode, @Query("units") String units, @Query("cnt") String cnt);
}
