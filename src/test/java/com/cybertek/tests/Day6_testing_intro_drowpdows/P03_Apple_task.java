package com.cybertek.tests.Day6_testing_intro_drowpdows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_task {
    public static void main(String[] args) {
        /*
         * TC #03: FINDELEMENTS_APPLE
         * 1. Open Chrome browser

         * 2. Go to https://www.apple.com/
         * 3. Click to all of the headers one by one
         * a. Mac, iPad, iPhone, Watch, TV, Music, Support
         * 4. Print out the titles of the each page
         * 5. Print out total number of links in each page
         * 6. While in each page:
         * a. Print out how many link is missing text TOTAL
         * b. Print out how many link has text TOTAL
         */
        //1
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2
        driver.get("https://apple.com");
        //3 storing 9 web elements including "apple" logo and search box
        //click to all of the headers by one
        //apple logo
        //mac
        //ipad
        //iphone
        //watch
        //tv
        //music
        //suport
        //search box
        List<WebElement> headerLinks=driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for(int eachLink=1; eachLink< headerLinks.size()-1;eachLink++){
            System.out.println(headerLinks.get(eachLink).getText());
//above returns webelement but if we add get.text we will get text
            headerLinks.get(eachLink).click();
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));



                    //5 print title
            System.out.println("current title in the page:"+driver.getTitle());

            //5 print links the number of links in each page.
            //we'd have to create a locator for this one
            List<WebElement>allLinks= driver.findElements(By.xpath("//body//a"));
            System.out.println("total numbers of links in current page"+allLinks.size());

            int linksWithNoText = 0;
            int linksWithText = 0;

            for (WebElement each : allLinks) {

                if (each.getText().isEmpty()){
                    linksWithNoText++;
                }else{
                    linksWithText++;
                }

            }


            //6. While in each page:
            // a. Print out how many link is missing text TOTAL
            System.out.println("--> Current page links with NO TEXT: " + linksWithNoText);

            // b. Print out how many link has text TOTAL
            System.out.println("--> Current page links with text: " + linksWithText);

        }

        }
    }



