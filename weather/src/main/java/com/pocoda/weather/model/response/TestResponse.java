package com.pocoda.weather.model.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TestResponse {
    public String key;
    public String value;
}
