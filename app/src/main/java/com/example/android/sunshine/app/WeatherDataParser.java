package com.example.android.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by nabil on 3/6/15.
 */

public class WeatherDataParser {

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
//        double max_temp = 0.0;
//
//        JSONObject forecastObject = new JSONObject(weatherJsonStr);
//        JSONArray days = forecastObject.getJSONArray("list");
//
//        for (int day = 0; day < days.length(); ++day) {
//            //
//            JSONObject day_obj = days.getJSONObject(day);
//
//            JSONObject temps = day_obj.getJSONObject("temp");
//
//            for (int temp = 0; temp < temps.length(); ++temp) {
//                if(day == dayIndex) {
//                    max_temp = temps.getDouble("max");
//                }
//            }
//
//        }
//        return max_temp;

        JSONObject weather = new JSONObject(weatherJsonStr);
        JSONArray days = weather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
        return temperatureInfo.getDouble("max");
    }

}