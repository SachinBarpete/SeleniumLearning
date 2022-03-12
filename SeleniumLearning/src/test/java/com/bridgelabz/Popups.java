package com.bridgelabz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popups {

    @Test
    public void popupTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");

        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();

        System.out.println("Before confirmation popup Alert Text: " + alert.getText());
        Thread.sleep(2000);

        alert.sendKeys("Sachin");
        Thread.sleep(2000);

        alert.dismiss();
        Thread.sleep(2000);

        System.out.println("After confirmation popup: "+alert.getText());

        Thread.sleep(3000);
        alert.accept();
    }
}
