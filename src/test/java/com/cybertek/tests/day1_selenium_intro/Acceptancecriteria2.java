package com.cybertek.tests.day1_selenium_intro;

public class Acceptancecriteria2 {

      /* Acceptance Criteria - 2
                * Get to Login Page and verified the "Login" title
                * Enter sales manager username "salesmanager143"
                * Enter sales manager password "UserUser123"
                * Click to login button
                * Verification for sales manager logged page
 */



        public static void main(String[] args) throws InterruptedException {
            SalesManager_part5.SalesManagerLogin("salesmanager143", "UserUser123");
        }
    }



