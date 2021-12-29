package com.pocoda.weather.model.response.weather;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Condition{
    public String text;
    public String icon;
    public int code;
}
