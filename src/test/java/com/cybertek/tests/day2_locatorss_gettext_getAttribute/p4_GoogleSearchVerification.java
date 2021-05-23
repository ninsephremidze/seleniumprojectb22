package com.cybertek.tests.day2_locatorss_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4_GoogleSearchVerification {
    public static void main(String[] args) {
        // open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to https.google.com

        driver.get("https:/google.com");

       // write "apple" in search box
//driver.findElement(By.name("q")).sendKeys(...charSequences:"apple"+ Keys.ENTER);
//click and search apple in google search
        //verify title
        //expected title shoulf start with google word
        String expectedInTitle="apple";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith("expectedInTitle")) {
            System.out.println("title verification passed");
        }else{
            System.out.println("verification failed");

        }


    }
}
