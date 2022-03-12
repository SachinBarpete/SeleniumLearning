package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyhomepageUsingURL {

    @Test
    public void verifyPageURL() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.javatpoint.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='container']/div[@id='link']/div[1]/ul[1]/li[3]/a[1]")).click();

        Thread.sleep(2000);
        String expectedURL = "https://www.javatpoint.com/java-tutori";

        if (driver.getCurrentUrl().equals(expectedURL))
            System.out.println("page is loaded");
        else
            System.out.println("page is not loaded");

    }
}
