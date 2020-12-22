package com.cybertek.tests.Practice.ZeroBank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
String expectedTitle="Zero - Log in";
String actuallTitle=driver.getTitle();
        if(actuallTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification test case PASS!");

        }else {
            System.out.println("Title verification test case FAILED!");
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actuallTitle = " + actuallTitle);

        }
        driver.close();
/*
TC #1: Zero Bank title verification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify titleExpected: “Zero -Log in”
 */

    }
}
