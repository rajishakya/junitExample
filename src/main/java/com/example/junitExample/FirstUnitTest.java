package com.example.junitExample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstUnitTest {

    @Autowired
    TestComponent testComponent;

    @Test
    public void whenThis_thenThat() {

        assertTrue(testComponent.test().equals("this is test bean"));

        System.out.println("testtestestsetetsetest");
        System.out.println(testComponent.test());
    }

    @Test
    public void whenSomething_thenSomething() {
        assertTrue(true);
    }

    @Test
    public void whenSomethingElse_thenSomethingElse() {
        assertTrue(true);
    }
}
