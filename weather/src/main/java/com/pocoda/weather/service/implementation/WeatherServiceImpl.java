package com.pocoda.weather.service.implementation;

import com.pocoda.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;
    @Value("${weather.api.url}")
    private String apiUrl;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    private RestTemplate restTemplate;

    @PostConstruct
    public void postConstruct() {
        restTemplate = restTemplateBuilder.build();
    }

    @Override
    public String getWeather() {
        String url = apiUrl + "/current.json?key={0}&q={1}&aqi=no";
        return this.restTemplate.getForObject(url, String.class, apiKey, "Krakow");
    }
}
