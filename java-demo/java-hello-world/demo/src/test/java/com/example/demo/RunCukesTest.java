package com.example.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "json:target/cucumber-reports/cucumber-report.json"},
        features="src/test/resources", tags = {})

public class RunCukesTest {
}