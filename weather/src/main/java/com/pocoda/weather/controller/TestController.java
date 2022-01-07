package com.pocoda.weather.controller;

import com.pocoda.weather.database.model.Test;
import com.pocoda.weather.database.repository.TestRepository;
import com.pocoda.weather.model.request.TestRequest;
import com.pocoda.weather.model.response.TestListResponse;
import com.pocoda.weather.model.response.TestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class TestController {
    @Autowired
    private TestRepository repository;

    @GetMapping("/test")
    public ResponseEntity<TestListResponse> index() {
        List<Test> all = repository.findAll();
        List<TestResponse> resultList = all.stream().map(item -> TestResponse.builder().value(item.getValue()).key(item.getKey()).build()).collect(Collectors.toList());
        TestListResponse result = TestListResponse.builder().testItems(resultList).build();
        return ResponseEntity.ok(result);
    }

    @PostMapping("/test")
    public ResponseEntity createTest(@RequestBody TestRequest request){
        Test result = repository.save(Test.builder().key(request.getKey()).value(request.getValue()).build());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/log")
    public String log(){
        log.error("error");
        log.warn("warn");
        log.info("info");
        log.debug("debug");
        int i = 1/0;
        return "success";
    }
}
