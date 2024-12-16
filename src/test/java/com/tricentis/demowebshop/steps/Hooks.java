package com.tricentis.demowebshop.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * Created by Jay Vaghani
 */
public class Hooks extends com.tricentis.demowebshop.utility.Utility {

    @Before
    public void setUp(){
        selectBrowser(com.tricentis.demowebshop.propertyreader.PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
       // closeBrowser();
    }
}
