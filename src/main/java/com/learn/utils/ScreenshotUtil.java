package com.learn.utils;

import com.learn.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtil {

   public static String screenShot() {
     return  ((TakesScreenshot)(DriverManager.getDriver())).getScreenshotAs(OutputType.BASE64);
   }
}
