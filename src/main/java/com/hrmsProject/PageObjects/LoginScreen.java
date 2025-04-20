package com.hrmsProject.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen {
	WebDriver driver;
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement Username_Tb;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement Password_Tb;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement Login_Btn;
	
	public LoginScreen(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String usernameValue) {
		Username_Tb.sendKeys(usernameValue);
	}
	public void enterPassword(String passwordValue) {
		Password_Tb.sendKeys(passwordValue);
	}
	public void clickOnLoginButton() {
		Login_Btn.click();
	}
	

}
