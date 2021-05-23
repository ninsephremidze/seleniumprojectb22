package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVersion_Homework {
    public static void main(String[] args) {
        //facebook title verification; open chrome; go to fscebook.com; verify title; expected results fb log in
        WebDriverManager.chromedriver().setup();
        //create driver instance and open browser
        WebDriver driver= new ChromeDriver();
        //use the 'driver ' object created to use selenium methods
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        String expectedTitle="Facebook log in or singup ";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification Successful!");
        }else{
            System.out.println("Verification Failed!!");
        }

    }
}
