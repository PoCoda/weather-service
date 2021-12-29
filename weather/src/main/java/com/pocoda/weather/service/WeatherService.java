package com.pocoda.weather.service;

import com.pocoda.weather.model.City;
import com.pocoda.weather.model.response.WeatherResponse;

public interface WeatherService {
    WeatherResponse getWeather(City city);
}
