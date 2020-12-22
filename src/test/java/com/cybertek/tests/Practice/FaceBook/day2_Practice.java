package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class day2_Practice {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
            driver .get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
String expectedTitle="Web Orders Login";
String accualTitle= driver.getTitle();
if (accualTitle.equalsIgnoreCase(expectedTitle)){
    System.out.println("Title verification examine PASS!");
}else {
    System.out.println("Title verification examine FAILED!");
    System.out.println("expectedTitle = " + expectedTitle);
    System.out.println("accualTitle = " + accualTitle);
}
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
driver.findElement(By.id("ctl00_MainContent_login_button")).click();
 String expectedOrderPageTitle="Web Orders";

String accualOrderPageTitle=driver.getTitle();
if (accualOrderPageTitle.equalsIgnoreCase(expectedOrderPageTitle)){
    System.out.println("Order Page Title Verification PASS");
}else {
    System.out.println("Order Page Title Verification FAILED");


            System.out.println("expectedOrderPageTitle = " + expectedOrderPageTitle);
            System.out.println("accualOrderPageTitle = " + accualOrderPageTitle);
}

  driver.close();

            }
        }
