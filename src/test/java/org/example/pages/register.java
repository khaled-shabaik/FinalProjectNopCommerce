package org.example.pages;

import org.example.TestCases.registration;
import org.example.base.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register {


    public register(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement register;

}
