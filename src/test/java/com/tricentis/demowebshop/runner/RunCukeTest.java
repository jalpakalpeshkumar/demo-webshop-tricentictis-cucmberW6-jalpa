package com.tricentis.demowebshop.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Jay Vaghani
 */

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/tricentis/demowebshop/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke or @sanity"


)
public class RunCukeTest extends AbstractTestNGCucumberTests {


}