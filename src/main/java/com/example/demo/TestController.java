package com.example.demo;   

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestComponent testComponent;

    public TestController(TestComponent testComponent) {
        this.testComponent = testComponent;
    }

    @GetMapping("/hello")
    public String hello() {
        return testComponent.getMessage();
    }
}