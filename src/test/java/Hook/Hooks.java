package Hook;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.hrmsProject.genaricLib.BaseClass;
import com.hrmsProject.genaricLib.PropertyFileClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	PropertyFileClass pfc=new PropertyFileClass();
	@Before
	public void Openapplication() throws IOException {
		driver.manage().window().maximize();
		driver.get(pfc.getLoginDataProp("URL"));
	}
	
	@After 
	public void closeApp(Scenario s) {
		
		if(s.isFailed()) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] pic = ts.getScreenshotAs(OutputType.BYTES);
		s.attach(pic, null, null);
		}
		
		driver.quit();
	}

}
