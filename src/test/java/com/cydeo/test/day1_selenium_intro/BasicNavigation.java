package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) {

        // 1 setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2 // create instance of the Selenium WebDriver

        WebDriver driver = new ChromeDriver();

        // 3 go to an URl address

        driver.get("https://www.tesla.com");





    }
}
