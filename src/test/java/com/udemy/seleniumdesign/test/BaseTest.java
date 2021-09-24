package com.udemy.seleniumdesign.test;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        System.out.println(
                "*********************   Create WebDriver Instance - Do not forget system property   *******************"
        );
        File IEDriver = new File("chromedriver.exe");
        System.setProperty("webdriver.ie.driver", IEDriver.getAbsolutePath());
        //this.driver = new FirefoxDriver();
    }


    @AfterTest
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.driver.quit();
    }

}
