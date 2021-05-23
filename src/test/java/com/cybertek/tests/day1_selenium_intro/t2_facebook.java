package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t2_facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com/%22");
                String actualText = driver.findElement(By.className("_8eso")).getText();
        String expectedText = "Connect with friends and the world around you on Facebook.";
        if(actualText.equals(expectedText)){
            System.out.println("verification completed, Status: PASSED! ");
        }else{System.out.println("verification completed, Status: FAILED! ");}
        driver.close();
    }
}
