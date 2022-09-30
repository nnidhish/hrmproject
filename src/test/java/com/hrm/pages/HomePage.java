package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.baseclass.Base;

public class HomePage {
	WebDriver driver;
    @FindBy(name="username")
    public WebElement userid;
    @FindBy(name="password")
	public WebElement password;		
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Login;		

	@FindBy(id="spanMessage")
	public WebElement LoginFalureMessage;
	@FindBy(linkText="Forgot your password?")
    public WebElement forgotpasswordlink;
	
	
public HomePage() {
	PageFactory.initElements(Base.driver, this);
}

}

