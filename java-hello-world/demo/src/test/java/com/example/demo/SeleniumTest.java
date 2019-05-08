package com.example.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SeleniumTest {

    private WebDriver browser;

    @LocalServerPort
    private int port;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        browser = new ChromeDriver();

    }

    @Test
    public void startTest() throws InterruptedException{
        browser.get("http://localhost:" + port);

        browser.manage().window().maximize();
        Thread.sleep(2000);
        String expected = "<html><head></head><body>Hello. This is a demo project.</body></html>";
        Assert.assertEquals(expected, browser.getPageSource());

    }

    @After
    public void tearDown() {
        browser.close();
    }
}