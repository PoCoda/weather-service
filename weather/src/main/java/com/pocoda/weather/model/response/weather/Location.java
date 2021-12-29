package com.pocoda.weather.model.response.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Location{
    public String name;
    public String region;
    public String country;
}
