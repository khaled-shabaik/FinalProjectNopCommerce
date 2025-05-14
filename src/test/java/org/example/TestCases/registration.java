package org.example.TestCases;

import org.example.base.base;
import org.example.pages.register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class registration extends base {
    WebDriver driver;
    register reg;
    @BeforeMethod
    public void setup()
    {
        driver = openBrowser();
        reg = new register(driver);
        reg.register.click();
    }

    @Test
    public void validSignUp()
    {
    driver.findElement(By.id("gender-male")).click();
    }


    @AfterMethod
    public void quitDrive() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
    }

}
