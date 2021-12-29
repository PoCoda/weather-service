package com.pocoda.weather.model.response;

import com.pocoda.weather.model.response.weather.Current;
import com.pocoda.weather.model.response.weather.Location;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WeatherResponse{
    public Location location;
    public Current current;
}
