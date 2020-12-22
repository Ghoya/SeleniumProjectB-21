package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_Tasks_TC2 {
// TC #2: Facebook incorrect login title verification
// 1.Open Chrome browser
// 2.Go to https://www.facebook.com
// 3.Enter incorrect username
// 4.Enter incorrect password
// 5.Verify title changed to:
// Expected: “Log into Facebook | Facebook”
public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.findElement(By.id("email")).sendKeys("canadaMubarak@gmail.com");
driver.findElement(By.name("pass")).sendKeys("12345"+ Keys.ENTER);
//driver.findElement(By.id("u_0_b")).click();
Thread.sleep(3000);
String expectedTitle="Log into Facebook | Facebook";
String actuallTitle = driver.getTitle();

if(actuallTitle.equalsIgnoreCase(expectedTitle)){
    System.out.println("Title verification test case PASS!");

}else {
    System.out.println("Title verification test case FAILED!");
    System.out.println("expectedTitle = " + expectedTitle);
    System.out.println("actuallTitle = " + actuallTitle);
driver.close();
}

}



}
