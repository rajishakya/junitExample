package com.example.junitExample;

import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;
import java.io.StringWriter;

@RestController
public class HelloController {

    @Autowired
    TestComponent testComponent;

    @RequestMapping("/")
    public String index() {

        System.out.println(testComponent.test());

        RunJUnit5TestsFromJava runner = new RunJUnit5TestsFromJava();
        runner.runAll();

        StringWriter out    = new StringWriter();
        PrintWriter  writer = new PrintWriter(out);

        TestExecutionSummary summary = runner.listener.getSummary();
        summary.printTo(writer);

        return out.toString();
    }

}
