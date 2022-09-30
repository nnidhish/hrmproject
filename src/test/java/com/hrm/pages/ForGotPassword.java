package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForGotPassword {

	WebDriver driver;
    @FindBy(name="username")
    public WebElement orangehrmusername;
	@FindBy(xpath="//button[@type='button']")
    public WebElement resetpassword;

}

