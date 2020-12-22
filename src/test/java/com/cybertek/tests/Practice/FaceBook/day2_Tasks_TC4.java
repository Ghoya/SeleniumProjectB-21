package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_Tasks_TC4 {

// TC #4: Facebook header verification
// 1.Open Chrome browser
// 2.Go to https://www.facebook.com
// 3.Verify “Create a page” link href value contains text:
// Expected: “"registration_form"”
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
   String Atr= driver.findElement(By.className("_8esh")).getAttribute("href");
   String expectedResult="registration_form";

if(Atr.contains(expectedResult)){
    System.out.println("Creat a Page link href value contains \'"+expectedResult+"\'");
}else {
    System.out.println("Creat a Page link href value dosn't contains \'"+expectedResult+'\'');
}

driver.close();



}





}
