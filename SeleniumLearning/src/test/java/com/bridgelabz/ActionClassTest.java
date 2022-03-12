package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.HashMap;

public class ActionClassTest {

    @Test
    public void mouseHoverTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.istqb.in/");

        Actions actions = new Actions(driver);

        Thread.sleep(1000);

        actions.moveToElement(driver.findElement(By.linkText("FOUNDATION"))).perform();

    }

    @Test
    public void DragAndDropTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();

        driver.close();

    }

    @Test
    public void FileDownload() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "F:\\learning\\Selenium");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.seleniumhq.org/download/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("4.1.2")).click();
    }


}



