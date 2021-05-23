package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

//3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
homeLink.isDisplayed();
        //b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));
       forgotPasswordHeader.isDisplayed();


        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));
        homeLink.isDisplayed();
        emailLabel.isDisplayed();
        //d. E-mail input box
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        homeLink.isDisplayed();
        inputEmail.isDisplayed();
        //e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));
retrievePasswordButton.isDisplayed();
        //f. “Powered by Cybertek School” text
        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
poweredByText.isDisplayed();
        //4. Verify all WebElements are displayed.

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());

        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());

        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());

        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());

    }
    }


