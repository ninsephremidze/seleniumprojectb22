package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesManager_part5 {
    public static void SalesManagerLogin (String name, String pass) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa3.vytrack.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";
        String verificationResult = actualTitle.equals(expectedTitle) ? "Title verified" : "Title NOT verified";
        System.out.println(verificationResult);
        WebElement username = driver.findElement(By.id("prependedInput"));
        WebElement password = driver.findElement(By.id("prependedInput2"));
        username.sendKeys(name);
        password.sendKeys(pass);
        System.out.println("Username and Password entered");
        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();
        System.out.println("Click the login button and logged in");
        Thread.sleep(2000);
        String actualLoggedTitle = driver.getTitle();
        String expectedLoggedTitle = "Dashboard";
        String fleetTitleVerResult = actualLoggedTitle.equals(expectedLoggedTitle) ?
                "Login Check Successful" : "Login Check NOT Successful";
        System.out.println(fleetTitleVerResult);
    }
}
