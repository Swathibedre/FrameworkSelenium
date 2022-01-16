package com.learn.test;

import com.learn.driver.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;


public class BaseTest {
     protected static WebDriver driver;

    @BeforeMethod
    public void setUp(Method  method) {
        DriverSetup.initDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--no-sandbox");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        capabilities.setBrowserName("chrome");
//        driver = new RemoteWebDriver(new URL("http://ec2-54-85-47-73.compute-1.amazonaws.com:4444/"),capabilities);
//

    }
    @AfterMethod
    public  void tearDown(){
        DriverSetup.quitBrowser();
    }
}

