package com.hrmsProjec.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public WebDriver driver;
	
	public void selectDropdown(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	public void moveToElement(WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void doubleClick(WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void rightClick(WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void dragAndDrop(WebElement src,WebElement trg) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,trg).perform();
	}
	public void navigateToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
		
	}
	public void navigateBackFromFrame(WebDriver driver,int index) {
		driver.switchTo().defaultContent();
		
	}
	
	public void scrollUptoEle(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguuments[0].scrollIntoView();",ele);
	}
	
	public void dismissAleart() {
		driver.switchTo().alert().dismiss();
	}

}
