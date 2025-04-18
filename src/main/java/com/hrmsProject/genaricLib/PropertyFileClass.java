package com.hrmsProject.genaricLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileClass {
	
	public String getLoginDataProp(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(Autoconstant.loginDataPropPath);
		p.load(fis);
		
		return p.getProperty(key);
	}

}
