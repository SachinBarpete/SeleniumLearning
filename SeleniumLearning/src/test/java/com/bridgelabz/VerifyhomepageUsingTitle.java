package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyhomepageUsingTitle {

    @Test
    public void verifyPageTitle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.javatpoint.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='container']/div[@id='link']/div[1]/ul[1]/li[3]/a[1]")).click();

        Thread.sleep(5000);
        String expectedTitle = "Java Tutorial | Learn Java Programming - javatpoint";

        if (driver.getTitle().equals(expectedTitle))
            System.out.println("page is loaded");
        else
            System.out.println("page is not loaded");

        driver.close();
    }
}
