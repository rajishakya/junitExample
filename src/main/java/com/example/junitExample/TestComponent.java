package com.example.junitExample;

import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    public String test() {
        return "this is test bean";
    }
}
