package com.pocoda.weather.model.response;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class TestListResponse {
    List<TestResponse> testItems;
}
