package com.cybertek.tests.day1_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_practice {
    public static void main(String[] args) {
        //setup  browse driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //the line above will open the chrome browser

        //maximize our browser
        driver.manage().window().maximize();


        //go to yahoo.com
        driver.get("https://www.yahoo.com");

        //verify title
        //expected:yahoo
        String expectedTitle="Yahoo";
        //actual value
        driver.getTitle();
        //the above code will return me the actual title

        //actual title
        String actualTitle=driver.getTitle();

        // create verification
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected.verification PASSED");
        }else{
            System.out.println("title is not as expected. Verification FAILED");

        }

//closing browser
        driver.close();
    }
}
