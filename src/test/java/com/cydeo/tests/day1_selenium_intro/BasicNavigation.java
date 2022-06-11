package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        // 1 setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2 // create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        // 3 Maximize current window
        driver.manage().window().maximize();
        // driver.manage().window().fullscreen(); sometimes does not work on Windows

        // 4 go to an URl address
        driver.get("https://www.tesla.com");



        System.out.println("Current title getTitle() = " + driver.getTitle());
        System.out.println("theCurrentURL getCurrentUrl() = " + driver.getCurrentUrl());

        // pause execution for 3 second
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().to("https://google.com");

        String title = driver.getTitle();
        System.out.println("Current title getTitle() = " + title);

        String theCurrentURL = driver.getCurrentUrl();
        System.out.println("theCurrentURL getCurrentUrl() = " + theCurrentURL);


        //Close the browser
        driver.quit();


    }
}
