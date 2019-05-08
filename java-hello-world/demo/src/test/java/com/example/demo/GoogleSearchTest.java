//package com.example.demo;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//// Example of how to run a selenium test
//// if you have internet access.
//public class GoogleSearchTest {
//
//    @Test
//    public void test() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//
//        ChromeDriver driver  = new ChromeDriver();
//
//        driver.get("http://google.com");
//        driver.manage().window().maximize();
//
//        WebElement searchTextBox = driver.findElement(By.name("q"));
//        searchTextBox.sendKeys("Selenium");
//
//        String pageUrl = driver.getCurrentUrl();
//        System.out.println(pageUrl);
//
//        Thread.sleep(2000);
//
//        searchTextBox.submit();
//
//        String pageTitle = driver.getTitle();
//        System.out.println("Page title is:" + pageTitle);
//
//        WebDriverWait wait = new WebDriverWait(driver, 5);// 5 seconds
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
//        driver.findElement(By.id("resultStats"));
//
//        Thread.sleep(2000);
//
//        Assert.assertEquals("Selenium - Google Search", pageTitle);
//        driver.quit();
//
//    }
//
//
//}