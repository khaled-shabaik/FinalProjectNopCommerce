package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class base {
    WebDriver driver;


    public WebDriver openBrowser()
    {
   String browserName = "chrome";

   if(browserName.contains("chrome"))
   {
       driver = new ChromeDriver();
   }
   // add more browsers here
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        return driver;
    }


}
