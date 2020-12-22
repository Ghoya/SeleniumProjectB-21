package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_Tasks_TC1 {
//TC #1: Facebook title verification
// 1.Open Chrome browser
// 2.Go to https://www.facebook.com
// 3.Verify title: Expected: “Facebook -Log In or Sign Up”
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("Facebook -Log In or Sign Up");

   String ExpectedTitle="Facebook -Log In or Sign Up";
String accualTitle=driver.getTitle();
if(accualTitle.equalsIgnoreCase(ExpectedTitle)){
    System.out.println("Title verification test PASS!");
}else {
    System.out.println("Title verification test FAILED!");
    System.out.println("ExpectedTitle = " + ExpectedTitle);
    System.out.println("accualTitle = " + accualTitle);
}
driver.close();

}
}
