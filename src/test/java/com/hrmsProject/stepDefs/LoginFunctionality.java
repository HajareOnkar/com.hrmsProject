package com.hrmsProject.stepDefs;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.testng.Assert;

import com.hrmsProject.PageObjects.DashbordScreen;
import com.hrmsProject.PageObjects.LoginScreen;
import com.hrmsProject.genaricLib.BaseClass;
import com.hrmsProject.genaricLib.DbConnect;
import com.hrmsProject.genaricLib.ExcelFileClass;
import com.hrmsProject.genaricLib.PropertyFileClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality extends BaseClass{
	ExcelFileClass getExceldata=new ExcelFileClass();
	LoginScreen loginScreen =new LoginScreen(driver);
	DashbordScreen dashbordScreen =new DashbordScreen(driver);
    PropertyFileClass prpertyFileClass=new PropertyFileClass();
    
	
	@Given("User navigate to Login Screen")
	public void User_navigate_to_Login_Screen() throws EncryptedDocumentException, IOException {
		
		String exp_loginScreenHeader=getExceldata.getExceldata("Headers",1,1).getStringCellValue();
		String act_exp_loginScreenHeader=driver.getTitle();
		Assert.assertEquals(act_exp_loginScreenHeader, exp_loginScreenHeader,"Not navigated to Login screen");
		
	}
	@When("User enters valid Username and Password")
	public void User_enters_valid_Username_and_Password() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		loginScreen.enterUsername(prpertyFileClass.getLoginDataProp("Username"));
		Thread.sleep(200);
		loginScreen.enterPassword(prpertyFileClass.getLoginDataProp("Password"));
		Thread.sleep(200);
	}
	@And("User clicks on login button")
	public void User_clicks_on_login_button() {
		loginScreen.clickOnLoginButton();
	}
	@Then("User lands on Dashbord screen")
	public void User_lands_on_Dashbord_screen() throws EncryptedDocumentException, IOException {
		String act_dashbordScreenHeader=getExceldata.getExceldata("Headers",2,1).getStringCellValue();
		String exp_act_dashbordScreenHeader=dashbordScreen.getDashbordScreenHeader();
		
		Assert.assertEquals(act_dashbordScreenHeader,exp_act_dashbordScreenHeader);
		
	}

}
