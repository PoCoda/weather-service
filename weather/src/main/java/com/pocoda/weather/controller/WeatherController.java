package com.pocoda.weather.controller;

import com.pocoda.weather.model.City;
import com.pocoda.weather.model.response.WeatherResponse;
import com.pocoda.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public ResponseEntity<WeatherResponse> getWeather(@RequestParam(value = "city", required = false) City city){
        var result = weatherService.getWeather(city);
        return ResponseEntity.ok(result);
    }
}
