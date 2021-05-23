package com.cybertek.tests.day2_locatorss_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavicationAndTitleVerification {
    public static void main(String[] args) {
         // open chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //these three lines are crucial and the first thing i do in the beginning


        //go to google.com
        driver.get("https:/www.google.com");
        // click to email from top right


        //get in between opening and lcosing tahg. glick gmail from top right
        driver.findElement(By.linkText("Gmail")).click();
        //above Gmail we got from the inspection of our google browser and coppying in between closign and opening tags


        //verify title contains. expected is gmail
        String expectedInTitle="Gmail";
        String actualTitle=driver.getTitle();
if(actualTitle.contains(expectedInTitle)) {
    System.out.println("title verification pass");
}else {
    System.out.println("title verification failed");

}
//command+D:multiplies the current line
        //moving the line up up and down: command+shift+up/down


        //go back to google using the/back();
        driver.navigate().back();

//Expected:google
        String expectedGoogleTitle="Google";
        String actualGoogleTitle=driver.getTitle();

if(actualGoogleTitle.equals(expectedInTitle)) {
    System.out.println("title verification passed");
}else{
    System.out.println("failed");


}
    }
}
