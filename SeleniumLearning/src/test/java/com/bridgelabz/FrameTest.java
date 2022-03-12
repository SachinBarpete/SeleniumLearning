package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest {

    @Test
    public void frameTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///F:/learning/SeleniumLearning/src/main/resources/page2.html");

        driver.findElement(By.id("t2")).sendKeys("12345");

        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("T1 text field");

        Thread.sleep(1000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("n2");
        driver.findElement(By.id("t3")).sendKeys("T3 text field");

        Thread.sleep(5000);

        driver.close();

    }
}
