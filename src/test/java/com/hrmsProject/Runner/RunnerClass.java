package com.hrmsProject.Runner;

import com.hrmsProject.genaricLib.BaseClass;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="FeatureFiles",
		glue={"com.hrmsProject.stepDefs","Hook"},
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "rerun:target/failedtc.txt"}
		
		)
public class RunnerClass extends BaseClass{

}
