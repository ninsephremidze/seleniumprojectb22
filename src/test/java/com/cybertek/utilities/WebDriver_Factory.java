package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

public class WebDriver_Factory {
    public static WebDriver getDriver (String browserType){
        WebDriver_Factory.getDriver("chrome");


        if (browserType.equals("chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
            // less error prone for .equals

        } else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else{
            System.out.println("given browser type doesnt exist. driver=null");
            return null;
        }

    }

}
