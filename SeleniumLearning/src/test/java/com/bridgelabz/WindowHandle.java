package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandle {

    @Test
    public void windowHandleTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.naukri.com/");

        String parentWindowId = driver.getWindowHandle();

        driver.findElement(By.xpath("//img[@src='https://img.naukimg.com/logo_images/groups/v2/2114.gif']")).click();

        Set<String> windowHandleIds = driver.getWindowHandles();

        Object[] landT = windowHandleIds.toArray();
        String childWindowId = String.valueOf(landT[1]);

        driver.switchTo().window(childWindowId);

        System.out.println("Tech Mahindra current URL: " + driver.getCurrentUrl());

        for (String window : windowHandleIds) {
            if (!window.equals(parentWindowId)) {
                driver.switchTo().window(window);
                Thread.sleep(2000);
                System.out.println("Tech Mahindra URL: " + driver.getCurrentUrl());

            }
        }
    }
}
