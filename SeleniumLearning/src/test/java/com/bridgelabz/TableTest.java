package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {

    @Test
    public void tableTest() {


        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///F:/learning/Selenium/Selenium093/src/main/resources/table.html");

        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("  "+driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText());
            }
            System.out.println();
        }


    }
}
