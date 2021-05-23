package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
   // 1-setup the browser driver
        WebDriverManager.chromedriver().setup();
        //2-create instance of selenium web driver
        WebDriver driver=new ChromeDriver();
        //no data will show up right now if we run it
//3 get the page
        driver.get("https://www.tesla.com");

        //going back using naviations; it will navigage back
        //putting three seconds of wait, stops the code for three seconds
        Thread.sleep(3000);
        driver.navigate().back();

        //going forward using navigations
        driver.navigate().forward();
        Thread.sleep(3000);


        //refresh the page using navigations
        driver.navigate().refresh();


        //going to another url using .to()method
        driver.navigate().to("https:google.com");

        //titletime
        System.out.println("title"+driver.getTitle());



    }
}
