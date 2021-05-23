package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findElements_practice {
    public static void main(String[] args) {
        //find elements

        //open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //if web element is not found, it will wait up to given seconfds, otherwise it will move on

        //go to http://practice.cybertekschool.com/forgot_password
driver.get("http://practice.cybertekschool.com/forgot_password");

//we need to create a locator that returns us all links on the page
        //body//a --> this locator will return all of the elements on the page
        driver.findElements(By.xpath("//body//a"));
        //we are storing all of the links by findelements method

        List<WebElement> listOfLinks=driver.findElements(By.xpath("//body//a"));


        //print texts of all links
        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));

        }
        //print out how many total links
        int numberOfLinks=listOfLinks.size();

        System.out.println(listOfLinks.size());//same as above
        System.out.println("numberoflinks+"+numberOfLinks);

    }
}
