package com.cybertek.tests.day2_locatorss_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsySearch_TitleVerification {
    public static void main(String[] args) {
        //open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();



        //go to https:/etsy.com
driver.get("https://etsy.com");



      //search for wooden spoon
        //we need to locate search bar first,search value and then enter
        //go to etsy.com and c;lick inspect
      //verify title- expected:"wooden spoon|Etsy
        //copy the input id from inspect cde
        driver.findElement(By.id("global-enhancements-search-query"));
               // .sendKeys(...charSequences:"wooden spoon"+ Keys.ENTER);

        //verify title
        //expected:"wooden spoon|Etsy
        String expectedTitle="Wooden Spoon|Etsy";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Etsy title passed");
        }else{
            System.out.println("failed");

        }



    }
}
