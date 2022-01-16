package com.learn.driver;

import com.learn.config.ConfigFactory;
import com.learn.config.FrameWorkConfig;
import org.openqa.selenium.WebDriver;

public class DriverSetup {
        static FrameWorkConfig config;


    public static WebDriver  initDriver(){
        config = ConfigFactory.getConfig();
        String browser = config.browserName();
        WebDriver driver = null;
        if(DriverManager.getDriver()==null) {
            driver= DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(config.url());
        }
        return driver;
    }

    public static void quitBrowser(){
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }

    }

}
