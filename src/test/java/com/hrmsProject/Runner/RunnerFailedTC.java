package com.hrmsProject.Runner;

import com.hrmsProject.genaricLib.BaseClass;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="FeatureFiles",
		glue= {"com.hrmsProject.stepDefs","Hook"},
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")

public class RunnerFailedTC extends BaseClass{

}
