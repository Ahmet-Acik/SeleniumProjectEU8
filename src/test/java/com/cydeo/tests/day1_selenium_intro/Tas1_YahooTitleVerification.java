package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tas1_YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://uk.yahoo.com");

        String expectedTitle= "Yahoo is part of the Yahoo family of brands";

        String title = driver.getTitle();

        if (title.equals(expectedTitle)) {
            System.out.println("title passed = " + title);

        } else {
            System.out.println("failed " + title);
        }

        Thread.sleep(3000);

        driver.quit();
    }
}
