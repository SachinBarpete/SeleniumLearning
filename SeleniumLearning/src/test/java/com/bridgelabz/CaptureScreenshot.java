package com.bridgelabz;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {

    @Test
    public void captureScreenshot() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File desFile = new File(".\\screenshot\\" + System.currentTimeMillis() / 1000 + "_facebook.png");

        try {
            FileHandler.copy(srcFile, desFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread.sleep(2000);
        driver.close();
    }

}

