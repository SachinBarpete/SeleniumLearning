package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassEg {

    @Test
    public void keyboardOperationTest() throws InterruptedException, AWTException {


        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        Robot robot = new Robot();

        robot.mouseMove(400,500);


        robot.keyPress(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_I);

        robot.keyRelease(KeyEvent.VK_I);

        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_C);

        robot.keyRelease(KeyEvent.VK_C);

        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(6000);

        driver.close();
    }
}
