package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newtask {
    private static WebDriver_Factory WebDriverFactory;

    public static void main(String[] args) {

        /**
         * TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
         * 1. Open Chrome browser
         * 2. Go to http://practice.cybertekschool.com/forgot_password
         * 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
         * a. “Home” link
         * b. “Forgot password” header
         * c. “E-mail” text
         * d. E-mail input box
         * e. “Retrieve password” button
         * f. “Powered by Cybertek School” text
         * 4. Verify all WebElements are displayed.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeButton = driver.findElement(By.cssSelector("body > nav > ul > li > a"));
        System.out.println(homeButton.isDisplayed());

        WebElement searchBox = driver.findElement(By.cssSelector("#forgot_password > div > div > input[type=text]"));
        System.out.println(searchBox.isDisplayed());

        WebElement resetPassButton = driver.findElement(By.cssSelector("#form_submit"));
        System.out.println(resetPassButton.isDisplayed());

        WebElement cybertekLink = driver.findElement(By.cssSelector("#page-footer > div > div > a"));
        System.out.println(cybertekLink.isDisplayed());
    }
}
