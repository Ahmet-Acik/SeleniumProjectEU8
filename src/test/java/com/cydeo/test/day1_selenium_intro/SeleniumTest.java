package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // setting up the web driver manager
        // WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();

        // create instance of the Selenium WebDriver.
        // WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        // driver.get("https://google.com");
        driver.get(" https://google.com");

        //Maximize current window
        // driver.manage().window().maximize();
        driver.manage().window().maximize();

        //Delay execution for 3 seconds to view the maximize operation
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Close the browser
        driver.quit();


    }
}



