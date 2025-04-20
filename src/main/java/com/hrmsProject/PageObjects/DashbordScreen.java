package com.hrmsProject.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordScreen {
	WebDriver driver;
	@FindBy(xpath="//span[@class=\"oxd-topbar-header-breadcrumb\"]")
	private WebElement dahbordScreenHeader;
	
	public DashbordScreen(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String getDashbordScreenHeader() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return dahbordScreenHeader.getText();
	}
	

}
