package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class FacebookTest {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        Boolean createNewAccount = driver.findElement(By.partialLinkText("Create New")).isEnabled();

        if (createNewAccount) {
            System.out.println("Create new Account button is enabled:" + createNewAccount);
            driver.findElement(By.linkText("Create New Account")).click();
        }

        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Sach");

        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Sachin");

        Thread.sleep(3000);

        List<WebElement> gender = driver.findElements(By.name("sex"));

        gender.get(1).click();

        Boolean femaleIsSelected = gender.get(0).isSelected();

        System.out.println("female is selected: " + femaleIsSelected);

        System.out.println("Title: " + driver.getTitle());

        System.out.println("Current URL: " + driver.getCurrentUrl());

        Thread.sleep(3000);

        driver.close();

    }


    @Test
    public void facebookLoginTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--disable-notifications");
        option.addArguments("--disable-geolocation");
        option.addArguments("--ignore-certificate-errors");

        WebDriver driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("8109555221");
        driver.findElement(By.id("pass")).sendKeys("test12345");
        driver.findElement(By.name("login")).click();

        driver.findElement(By.xpath("//span[contains(text(),'John Smith')]")).click();
        Thread.sleep(4000);

        driver.close();



    }
}
